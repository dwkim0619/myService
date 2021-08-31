package com.myBatis.myService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myBatis.myService.dao.BaseCodeDao;
import com.myBatis.myService.model.BaseCode;

@RestController
public class BaseCodeController {

	@Autowired
	BaseCodeDao baseCodeDao;
	
	@GetMapping("/codelist")
	public List<BaseCode> list()
	{
		return baseCodeDao.selectList();
	}
	
}
