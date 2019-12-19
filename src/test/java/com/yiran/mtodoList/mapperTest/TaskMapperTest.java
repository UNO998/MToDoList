package com.yiran.mtodoList.mapperTest;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yiran.mtodoList.bean.Task;
import com.yiran.mtodoList.mapper.TaskMapper;

/**
 * Created by Yiran in Dec. 19, 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskMapperTest {

	@Autowired
	TaskMapper mapper;
	
	@Test
	void testAddTask() {
		Task task = Task.builder()
							 .title("Play baseball")
							 .description("Go to college station with John")
							 .dueDate(new Timestamp(System.currentTimeMillis()))
							 .state(0)
							 .build();
		
		System.out.println(task);
		Assert.assertEquals(1, mapper.addTask(task));
	}
	
	@Test
	void testUpdateTask() {
		Task task = Task.builder()
							 .id(2L)
							 .title("Play baseball")
							 .description("Go to college station with John")
							 .dueDate(new Timestamp(System.currentTimeMillis()))
							 .state(0)
							 .build();
		
		System.out.println(task);
		Assert.assertEquals(1, mapper.updateTask(task));
	}
	
	@Test
	void testGetTaskById() {
		Task task = mapper.getTaskById(1L);
		
		if (task != null) {
			Assert.assertEquals("Meet Doc Joey", task.getTitle());
			Assert.assertEquals("Need to discuss my essay with Dr Joey", task.getDescription());
			Assert.assertEquals(0, (int)task.getState());
		} else {
			Assert.fail();
		}
	}
	
	@Test
	void testDeleteTaskById() {
		Assert.assertEquals(1, mapper.deleteTaskById(2L));
	}

}
