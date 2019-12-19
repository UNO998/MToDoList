package com.yiran.mtodoList.webController;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Task theTask = new Task();
		
		theModel.addAttribute("task", theTask);
		
		return "tasks/task-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("taskId") Long theId,
									Model theModel) {
		
		// get the task from the service
		Task theTask = taskService.getTaskById(theId);
		
		// set task as a model attribute
		theModel.addAttribute("task", theTask);
		
		return "tasks/task-form";			
	}
	
	@PostMapping("/save")
	public String addTask(
			@ModelAttribute("task") Task theTask,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "tasks/task-form";
		}
		else {		
			// save the task
			if (theTask.getId() == null) {
				taskService.addTask(theTask);
			} else {
				taskService.updateTask(theTask);
			}

			// use a redirect to prevent duplicate submissions
			return "redirect:/tasks/list";
		}
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("taskId") Long theId) {
		
		// delete the employee
		taskService.deleteTaskById(theId);
		
		// redirect to /employees/list
		return "redirect:/tasks/list";
		
	}
}
