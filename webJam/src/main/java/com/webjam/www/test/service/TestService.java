package com.webjam.www.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjam.www.test.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private TestDao td;
	
	public String getInfo(String no) throws Exception {
		return td.getInfo(no);
	}
	
	
}
