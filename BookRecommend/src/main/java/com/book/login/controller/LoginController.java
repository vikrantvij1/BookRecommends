package com.book.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.book.login.dao.LoginDao;
import com.book.login.model.LoginModel;


@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginDao loginDao;
	   @RequestMapping(value="/loginHome",method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "index";
	   }
	   
	   @RequestMapping(value="/home",method = RequestMethod.GET)
	   public String showHome(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      LoginModel lm= new LoginModel();
	      lm.setUserName("Vikrant Vij");
	      lm.setPassword("vikrant");
	      loginDao.addUser(lm);
	      return "about";
	   }
	   
	   @RequestMapping(value="/contact",method = RequestMethod.GET)
	   public String showContact(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "contact";
	   }
	}
