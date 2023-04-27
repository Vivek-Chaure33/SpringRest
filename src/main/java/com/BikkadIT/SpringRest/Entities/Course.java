package com.BikkadIT.SpringRest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	private String name;
	private String description;
	
	
	
	
	public Course(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
	
}
