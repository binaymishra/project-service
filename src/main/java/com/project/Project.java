package com.project;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	String id;
	
	String name;
	
	public Project() {	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
