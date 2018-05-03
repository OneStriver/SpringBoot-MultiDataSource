package com.sunkaisens.statistic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sunkaisens.statistic.modal.Student;

@Mapper
public interface StudentDao {
	
	List<Student> getLocalList();
	
	List<Student> getLocalHss1List();
	
	List<Student> getLocalHss2List();
}
