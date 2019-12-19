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

}
