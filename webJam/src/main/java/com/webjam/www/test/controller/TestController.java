package com.webjam.www.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjam.www.test.service.TestService;
 
@Controller
public class TestController {
	
	@Autowired
	TestService ts;
	
	@RequestMapping("/")
    public String testMain(Model model) throws Exception{
        return "testMain";
    }
	
	@RequestMapping("/testBoard")
    public String testBoard(Model model) throws Exception{
        return "test/testBoard";
    }
	
	@RequestMapping("/testCalendar")
    public String testCalendar(Model model) throws Exception{
        return "test/testCalendar";
    }
	
	@RequestMapping("/testDB")
    public String testDB(Model model) throws Exception{
		
		String no = "1";
		String id = ts.getInfo(no);
		model.addAttribute("id", id);
		
        return "test/testDB";
    }
	
}




