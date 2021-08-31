package com.myBatis.myService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myBatis.myService.dao.DeptDao;
import com.myBatis.myService.model.Dept;

@Controller
public class HomeController {
	
	@Autowired
	DeptDao deptDao;
	
	@GetMapping("/home")
	public ModelAndView goHome() {
		
		ModelAndView mav = new ModelAndView();
		List<Dept> resultList = deptDao.selectList();
		mav.addObject("resultList", resultList);
		mav.setViewName("content/home");
		
		return mav;
	}
}
