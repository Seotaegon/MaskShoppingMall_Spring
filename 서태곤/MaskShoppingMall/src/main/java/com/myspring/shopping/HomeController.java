package com.myspring.shopping;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.myspring.shopping.Bean.BoardBean;
import com.myspring.shopping.maskAPI.MaskAPI;
import com.myspring.shopping.service.BoardService;
import com.myspring.shopping.testdb.TestService;
import com.myspring.shopping.testdb.TestVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static final String namespace="com.myspring.shopping.MaskAPIMapper";
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/Mask", method = RequestMethod.GET)
	public String Maks(Locale locale, Model model) {
	
		return "Mask";
	}
	
	/*@RequestMapping(value = "/Mask", method = RequestMethod.GET)
	@ResponseBody
	public String Mask(Locale locale, Model model) {
		List<MaskAPI> mask = sqlSession.selectList(namespace + "Select");
		return new Gson().toJson(mask);
	}*/
	
	@Inject
	TestService service;

	@RequestMapping(value="/Test",method = RequestMethod.GET)

	public String Test(Model model) throws Exception {

		List<TestVO> list;		
		list = service.test();	
		model.addAttribute("list",list);	
		
		return "Test";
	}
	
	@Inject
	BoardService boardService;

	@RequestMapping(value="/List",method = RequestMethod.GET)
	public String List(Model model) throws Exception {

		List<BoardBean> list;		
		list = boardService.list();	
		model.addAttribute("list",list);	
		
		return "/Board/List";
	}
}
