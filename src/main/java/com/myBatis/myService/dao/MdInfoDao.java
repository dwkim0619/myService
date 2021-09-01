package com.myBatis.myService.dao;

import org.apache.ibatis.annotations.Mapper;

import com.myBatis.myService.model.MdInfo;

@Mapper
public interface MdInfoDao {
	public MdInfo selectItem();
}
