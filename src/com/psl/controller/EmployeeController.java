package com.psl.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.entity.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/showEmpPage", method=RequestMethod.GET)
	public String showEmpPage(){
		//contact model(service and dao layer)
		return "empHome"; //logical view name
	}

	@RequestMapping(value="/{empName}", method=RequestMethod.GET)
	public String showEmpDetailsPage(@PathVariable String empName, Model model, @RequestParam String age){
		//contact model(service and dao layer)
		System.out.println(empName);
		model.addAttribute("name", empName);
		model.addAttribute("age", age);
		return "emp"; //logical view name
	}
	
//	@RequestMapping(value="/register", method=RequestMethod.POST)
//	public String register(Model model,@ModelAttribute Employee employee){
//		System.out.println("Employee to be registered"+employee.getName());
//		model.addAttribute("employee",employee);
//		return "redirect:/register";
//	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(Model model,@Valid Employee employee, BindingResult result){
		if(result.hasErrors())
			return "register";
		
		System.out.println("Employee to be registered"+employee.getName());
		
		model.addAttribute("employee",employee);
		return "redirect:/register";
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegister(Model model){
		model.addAttribute("employee", new Employee());
		return "register";
	}
}
