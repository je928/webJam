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
	
	@RequestMapping("/aa")
    public String aa(Model model) throws Exception{
		
		String no = "1";
		String id = ts.getInfo(no);
		model.addAttribute("id", id);
		
        return "test/aa";
    }
	
	@RequestMapping("/bb")
    public String bb(Model model) throws Exception{
		
        return "bb";
    }
	
}




