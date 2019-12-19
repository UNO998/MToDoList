package com.yiran.mtodoList.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yiran.mtodoList.bean.Task;

/**
 * Created by Yiran in Dec. 19, 2019
 * interface for CRUD task
 */

@Mapper
public interface TaskMapper {
	
	int addTask(Task task);

	int updateTask(Task task);
	
	Task getTaskById(Long tid);
	
	int deleteTaskById(Long tid);
	
	List<Task> getAllTasks();
}
