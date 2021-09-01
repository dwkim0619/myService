package com.myBatis.myService.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myBatis.myService.dao.MdInfoDao;
import com.myBatis.myService.model.MdInfo;

@Service
public class MdInfoServiceImpl implements MdInfoService {

	@Autowired
	MdInfoDao mdInfoDao;
	
	@Override
	public MdInfo selectItem() {
		return mdInfoDao.selectItem();
	}

}
