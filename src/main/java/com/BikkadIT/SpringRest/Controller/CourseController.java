package com.BikkadIT.SpringRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.SpringRest.Entities.Course;
import com.BikkadIT.SpringRest.Services.CourseServiceI;



@RestController
public class CourseController {
	@Autowired
	CourseServiceI courseServiceI;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		List<Course> courses = courseServiceI.getCourses();
		return courses;
	}
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		
		Course course = courseServiceI.getCourse(Long.parseLong(courseId));
		return  course;
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		Course course2 = courseServiceI.addCourse(course);
				
		return course2;
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course1) {
		
		Course course2=courseServiceI.updateCourse(course1);
		
		return course2;
		
	}
	@DeleteMapping("/courses/{id}")
	public Course deleteCourse(@PathVariable String id) {
	
		Course deleteCourse = courseServiceI.deleteCourse(Long.parseLong(id));
		
		return deleteCourse;
	}
	
	
}
