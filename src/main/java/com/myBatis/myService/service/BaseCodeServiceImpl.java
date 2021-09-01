package com.myBatis.myService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myBatis.myService.dao.BaseCodeDao;
import com.myBatis.myService.model.BaseCode;

@Service
public class BaseCodeServiceImpl implements BaseCodeService{

	@Autowired
	BaseCodeDao baseCodeDao;
	
	@Override
	public List<BaseCode> selectList() {
		return baseCodeDao.selectList();
	}

}
