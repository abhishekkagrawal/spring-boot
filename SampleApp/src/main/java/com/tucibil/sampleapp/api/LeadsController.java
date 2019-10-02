package com.tucibil.sampleapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tucibil.sampleapp.model.Leads;
import com.tucibil.sampleapp.service.LeadsService;

@Controller
public class LeadsController {
    
    @Autowired
    private LeadsService leadsService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Leads> listLeads = leadsService.listAllLeads();
        model.addAttribute("listProducts", listLeads);
         
        return "index";
    }
    
    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Leads leads = new Leads();
        model.addAttribute("leads", leads);
         
        return "new_product";
    }
    
    @PostMapping(value = "/save")
    public String saveProduct(@ModelAttribute("leads") Leads leads) {
	leadsService.insertLeads(leads);
         
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") long id) {
        ModelAndView mav = new ModelAndView("edit_product");
        Leads leads = leadsService.getLeads(id);
        mav.addObject("leads", leads);
         
        return mav;
    }
}
