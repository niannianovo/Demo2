package com.demo2.service;

import com.demo2.pojo.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Course> getCourseList();
    Course getById(Integer id);
    Course getByName(String name);
    int addCourse(Course course);
    int deleteCourse(Integer id);
    int updateCourse(Course course);
}
