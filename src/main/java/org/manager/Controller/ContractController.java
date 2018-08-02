package org.manager.Controller;

import org.manager.ServiceEntity.ContractService;
import org.manager.ServiceEntity.PersonService;
import org.manager.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
public class ContractController {
    private ContractService contractService;

    @Autowired(required = true)
    public void setContractService(ContractService contractService){
        this.contractService = contractService;
    }

    @Inject
    public ContractController(ContractService contractService){
        this.contractService = contractService;
    }


    @RequestMapping(value = "contractsList", method = RequestMethod.GET)
    public String listContracts(Model model){
        List<Contract> list = contractService.contractList();
        model.addAttribute("listContracts", list);
        return "contracts";
    }

    @RequestMapping(value = "/addContract")
    public String addContract() {
        return "/addContract";
    }

    @RequestMapping(value = "/addContract", method = RequestMethod.POST)
    public String addContract(@ModelAttribute("contract") Contract contract) {
        contractService.add(contract);
        return "redirect:/contracts";
    }
}
