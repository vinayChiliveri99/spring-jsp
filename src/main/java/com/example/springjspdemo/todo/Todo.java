package com.example.springjspdemo.todo;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class Todo {

	public Todo(int id, String username, String description, LocalDate targetDate, boolean isdone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isdone = isdone;
	}

	private int id;
	private String username;
	
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean isdone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isIsdone() {
		return isdone;
	}

	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", isdone=" + isdone + "]";
	}

}
