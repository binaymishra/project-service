package com.project;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	Integer id;
	
	String name;
	
	public Project() {	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	
}
