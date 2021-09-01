package com.myBatis.myService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myBatis.myService.dao.DeptDao;
import com.myBatis.myService.dao.MdInfoDao;
import com.myBatis.myService.model.Dept;
import com.myBatis.myService.model.MdInfo;
import com.myBatis.myService.service.DeptService;
import com.myBatis.myService.service.MdInfoService;
import com.myBatis.myService.service.MdInfoServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	DeptService deptSrvc;
	@Autowired
	MdInfoService mdInfoSrvc;
	
	@GetMapping("/home")
	public ModelAndView goHome() {
		
		ModelAndView mav = new ModelAndView();
		
		List<Dept> resultList = deptSrvc.selectList();
		mav.addObject("resultList", resultList);
		
		MdInfo mdInfo = mdInfoSrvc.selectItem();
		mav.addObject("mdInfo", mdInfo);
		
		mav.setViewName("content/home");
		
		return mav;
	}
}
