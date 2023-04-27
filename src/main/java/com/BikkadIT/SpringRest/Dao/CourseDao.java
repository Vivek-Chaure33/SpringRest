package com.BikkadIT.SpringRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.SpringRest.Entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
