package com.yiran.mtodoList.bean;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Yiran in Dec. 19, 2019
 */

@Data
@Builder
public class Task {
	
	@NotNull
	private Long id;
	private String title;
	private String description;
	private Timestamp dueDate;
	private Integer state;
	
	// provide for myBatis
	public Task() {
		
	}
	
	// provide for lombok builder
	public Task(Long id, String title, String description, Timestamp dueDate, Integer state) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.state = state;
	}
}
