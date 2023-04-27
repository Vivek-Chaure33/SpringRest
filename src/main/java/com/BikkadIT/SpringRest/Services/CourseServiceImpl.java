package com.BikkadIT.SpringRest.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringRest.Dao.CourseDao;
import com.BikkadIT.SpringRest.Entities.Course;

import jakarta.persistence.Id;
@Service
public class CourseServiceImpl implements CourseServiceI{
	
	
	@Autowired
	CourseDao courseDao;
	
//	List<Course> list;
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(1,"Java","This is java Course"));
//		list.add(new Course(2,"Python","This is python Course"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		List<Course> findAll = courseDao.findAll();
		return findAll;
	}


	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c=course;
//				break;
//			}
//		}
		@SuppressWarnings("deprecation")
		Course course = courseDao.getOne(courseId);
		
		return course;
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		Course save = courseDao.save(course);
		return save;
	}

	@Override
	public Course updateCourse(Course course1) {
		
//		for(Course course:list) {
//			if(course.getId()==course1.getId()) {
//				course.setName(course1.getName());
//				course.setDesc(course1.getDesc());
//			}
//		}
		
		Course update = courseDao.save(course1);
		
		return update;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course deleteCourse(long id) {
//		for(Course course:list) {
//			if(course.getId()==id) {
//				int i = list.indexOf(course);
//				list.remove(i);
//			}
//			
//		}
		Course course = courseDao.getOne(id);
		courseDao.delete(course);
		
		return course;
	}

}
