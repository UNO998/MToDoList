package com.yiran.mtodoList.webController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiran.mtodoList.bean.Task;
import com.yiran.mtodoList.service.TaskService;

/**
 * Created by Yiran in Dec. 19, 2019
 * provide controller for thymeleaf mvc
 */

@Controller
@RequestMapping("/tasks")
public class TaskWebController {

    private final Logger log = LoggerFactory.getLogger(TaskWebController.class);
    
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/list")
	String getAllTasks(Model theModel) {
		log.info("Request to get all tasks");
		
		List<Task> theTasks = taskService.getAllTasks();
		
		// add to the spring model
		theModel.addAttribute("tasks", theTasks);
		
		return "tasks/list-tasks";
	}
}
