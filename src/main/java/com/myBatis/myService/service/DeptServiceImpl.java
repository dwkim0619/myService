package com.myBatis.myService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myBatis.myService.dao.DeptDao;
import com.myBatis.myService.model.Dept;

public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDao deptDao;
	
	@Override
	public List<Dept> selectList() {
		return deptDao.selectList();
	}

}
