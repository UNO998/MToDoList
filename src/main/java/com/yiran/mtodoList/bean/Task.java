package com.yiran.mtodoList.bean;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Yiran in Dec. 19, 2019
 */


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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate
				+ ", state=" + state + "]";
	}
	
	
}
