package org.manager.Controller;

import org.manager.ServiceEntity.ContractService;
import org.manager.ServiceEntity.PersonService;
import org.manager.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.naming.Binding;
import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonController {
    private PersonService personService;

    @Autowired(required = true)
    public void setPersonService(PersonService personService){
        this.personService = personService;
    }

    @Inject
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(value = "/personslist", method = RequestMethod.GET)
    public String listPerson(Model model){
        List<Person> list = personService.personList();
        model.addAttribute("listPerson", list);
        return "persons";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String addPerson(Model model) {
//        model.addAttribute(new Person());
//        return "/addPerson";
//    }
//
    @RequestMapping(value = "/addPerson",method = RequestMethod.GET)
    public String addPerson(Model model, Person person) {
        model.addAttribute(person);
        return "/addPerson";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addPersonPost(@Valid Person person) {
        personService.add(person);
        return "redirect:/persons";
    }
}
