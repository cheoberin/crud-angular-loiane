package com.java.crudspring.service;

import com.java.crudspring.model.Course;
import com.java.crudspring.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> list() {
        return courseRepository.findAll();
    }
}
