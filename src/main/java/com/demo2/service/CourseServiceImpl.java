package com.demo2.service;

import com.demo2.mapper.CourseMapper;
import com.demo2.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        return courseMapper.selectAll();
    }

    @Override
    public Course getById(Integer id) {
        return courseMapper.getById(id);
    }

    @Override
    public Course getByName(String name) {
        return courseMapper.getByName(name);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.add(course);
    }

    @Override
    public int deleteCourse(Integer id) {
        return courseMapper.delete(id);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.update(course);
    }
}
