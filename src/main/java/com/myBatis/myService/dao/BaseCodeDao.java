package com.myBatis.myService.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myBatis.myService.model.BaseCode;

@Mapper
public interface BaseCodeDao {
	public List<BaseCode> selectList();
}
