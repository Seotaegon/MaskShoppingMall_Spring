package com.myspring.shopping.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.shopping.testdb.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		
		return "home";
	}
	
	@Inject
	MemberService service;

	/* @RequestMapping(value="/Test",method = RequestMethod.GET) */

	/*public String Test(Model model) throws Exception {

		List<TestVO> list;		
		list = service.test();	
		model.addAttribute("list",list);	
		
		return "Test";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)

	public String Login(Model model) throws Exception {

		List<MemberVO> login;		
		login = service.signup(vo);	
		model.addAttribute("login",login);	
		
		return "login";
	}*/
}
