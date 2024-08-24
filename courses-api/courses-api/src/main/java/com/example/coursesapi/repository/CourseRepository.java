package com.example.coursesapi.repository;

import com.example.coursesapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course, Long>  {

}
