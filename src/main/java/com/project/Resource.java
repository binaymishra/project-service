package com.project;

import org.springframework.data.annotation.Id;

public class Resource {
	
	@Id
	String id;
	
	String name;
	
	String designation;
	
	public Resource() {	}

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}
