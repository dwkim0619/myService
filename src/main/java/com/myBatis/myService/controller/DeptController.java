package com.myBatis.myService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myBatis.myService.dao.DeptDao;
import com.myBatis.myService.model.Dept;

@RestController
public class DeptController {

	@Autowired
	DeptDao deptDao;
	
	@GetMapping("/deptlist")
	public List<Dept> list() {
		return deptDao.selectList();
	}
}
