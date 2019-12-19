package com.yiran.mtodoList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yiran.mtodoList.bean.Task;
import com.yiran.mtodoList.mapper.TaskMapper;

/**
 * Created by Yiran in Dec. 19, 2019
 * task Service layer for mvc
 */

@Service
@Transactional
public class TaskService {
	
	@Autowired
	TaskMapper taskMapper;
	
	public int addTask(Task task) {
		return taskMapper.addTask(task);
	}
	
	public int deleteTaskById(Long tid) {
		return taskMapper.deleteTaskById(tid);
	}
	
	public int updateTask(Task task) {
		return taskMapper.updateTask(task);
	}
	
	public Task getTaskById(Long tid) {
		return taskMapper.getTaskById(tid);
	}
	
	public List<Task> getAllTasks() {
		return taskMapper.getAllTasks();
	}
}
