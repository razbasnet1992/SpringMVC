package com.crud.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud.mvc.dao.EmployeeDao;
import com.crud.mvc.models.Emp;

@Controller
public class EmpController {
	@Autowired
	EmployeeDao empDao;
	
	@RequestMapping("/employee")
	public ModelAndView showForm(ModelAndView mv) {

		mv.setViewName("empform");
		return mv;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") Emp employee) {
		empDao.addEmployee(employee);
		
		ModelAndView mv = new ModelAndView("redirect:/viewemp");
		return mv;
	}

	@RequestMapping("/viewemp")
	public ModelAndView listAllEmp(ModelAndView mv) {
		// #TODO GET ALL EMPLOYEE FROM DATABASE AND SEND TO JSP
		List<Emp> list=empDao.getEmployees();
		mv.addObject("list",list);
		mv.setViewName("allEmployees");
		return mv;

	}

	@RequestMapping("/edit/{id}")
	public ModelAndView editEmp(ModelAndView mv, @PathVariable int id) {
		// #TODO GET EMPLOYEE DETAILS USING ID FROM DATABASE
		Emp emp = empDao.getEmpById(id);
		mv.addObject("emp",emp);
		mv.setViewName("editEmp");
		return mv;

	}
@RequestMapping(value = "/edit" ,method = RequestMethod.POST) 
	public ModelAndView updateEmp(@ModelAttribute("employee") Emp employee) {
		// #TODO UPDATE EMPLOYEE INTO DATABASE
	    empDao.update(employee);
	   
		ModelAndView mv = new ModelAndView("redirect:/viewemp");
		return mv;
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteEmp(@PathVariable int id) {
		// #TODO GET EMPLOYEE DETAILS USING ID FROM DATABASE
		empDao.delete(id);
		ModelAndView mv = new ModelAndView("redirect:/viewemp");
		return mv;
	}
}
