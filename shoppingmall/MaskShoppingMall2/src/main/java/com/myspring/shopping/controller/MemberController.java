package com.myspring.shopping.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.shopping.domain.memberVO;
import com.myspring.shopping.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController{
	private static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;

	@Autowired
	BCryptPasswordEncoder passEncoder;
	  
	// 회원 가입 get
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception {
	 Logger.info("get signup");
	}

	// 회원 가입 post
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(memberVO vo) throws Exception {
	 Logger.info("post signup");
	  
	 String inputPass = vo.getUserPass();
	 String pass = passEncoder.encode(inputPass);
	 vo.setUserPass(pass);

	 service.signup(vo);

	 return "redirect:/";
	}
	
}