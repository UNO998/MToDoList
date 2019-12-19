package com.yiran.mtodoList.restController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiran.mtodoList.bean.Task;
import com.yiran.mtodoList.service.TaskService;

/**
 * Created by Yiran in Dec. 19, 2019
 */

@RestController
@RequestMapping("/api")
public class TaskRestController {

	private final Logger log = LoggerFactory.getLogger(TaskRestController.class);
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/task")
	ResponseEntity<Integer> addTask(@Valid @RequestBody Task task) {
		
		log.info("Request to add task: {}", task);
		
		int result = taskService.addTask(task);
		
		if (result == 1) {
			return ResponseEntity.ok().body(result);
		} else {
			return ResponseEntity.badRequest().body(result);
		}
	}
	
	@GetMapping("/task/{tid}")
	ResponseEntity<?> getTaskById(@PathVariable Long tid) {
		log.info("Request to get task id=: {}", tid);
		
		Task task = taskService.getTaskById(tid);
		
		if (task == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return ResponseEntity.ok().body(task);
		}
	}
	
	@GetMapping("/tasks")
	Collection<Task> getTaskById() {
		log.info("Request to get all tasks");
		
		List<Task> theTasks = taskService.getAllTasks();
		
		if (theTasks == null) {
			return new ArrayList<Task>();
		} else {
			return theTasks;
		}
	}
	
	@PutMapping("/task")
	ResponseEntity<?> updateTask(@Valid @RequestBody Task task) {
		log.info("Request to update task: {}", task);
		
		int result = taskService.updateTask(task);
		
		if (result != 1) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return ResponseEntity.ok().body(result);
		}
	}
	
	@DeleteMapping("/task/{tid}")
	ResponseEntity<?> deleteTaskById(@PathVariable Long tid) {
		log.info("Request to delete task id=: {}", tid);
		
		int result = taskService.deleteTaskById(tid);
		
		if (result != 1) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return ResponseEntity.ok().body(result);
		}
	}
}
