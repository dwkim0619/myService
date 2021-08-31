package com.myBatis.myService.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myBatis.myService.model.Dept;

@Mapper
public interface DeptDao {
	public List<Dept> selectList();

}
