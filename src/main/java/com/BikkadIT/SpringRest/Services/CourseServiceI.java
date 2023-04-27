package com.BikkadIT.SpringRest.Services;

import java.util.List;

import com.BikkadIT.SpringRest.Entities.Course;

public interface CourseServiceI {
	public List<Course> getCourses();
	
	public Course getCourse(long id);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course1);
	
	public Course deleteCourse(long id);
}	
