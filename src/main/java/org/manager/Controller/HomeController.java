package org.manager.Controller;

import org.manager.ServiceEntity.ContractService;
import org.manager.ServiceEntity.ContractServiceImpl;
import org.manager.ServiceEntity.PersonService;
import org.manager.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;


@Controller
public class HomeController {

    @RequestMapping({"/", "home"})
    public String printWelcome() {
        return "home";
    }


}
