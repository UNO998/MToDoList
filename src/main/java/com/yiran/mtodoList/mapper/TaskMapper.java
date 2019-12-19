package com.yiran.mtodoList.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yiran.mtodoList.bean.Task;

/**
 * Created by Yiran in Dec. 19, 2019
 * interface for CRUD task
 */

@Mapper
public interface TaskMapper {
	
	// add one task to database
	int addTask(Task task);
}
