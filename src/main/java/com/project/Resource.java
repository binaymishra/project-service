package com.project;

public class Resource {
	
	String id;
	
	String name;
	
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

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + "]";
	}
	
}
