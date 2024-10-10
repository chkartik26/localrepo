package net.javaguides.springboot.services;

import net.javaguides.springboot.entities.Course;
import net.javaguides.springboot.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
            private CourseRepo courseRepo;

    @Override
    public List<Course> getCourses() {
    return courseRepo.findAll();
    }


    @Override
    public Course getCourse(long courseId) {
        Course course = courseRepo.findById(courseId).orElse(null);
        return course;
    }


    @Override
    public Course addCourse(Course course) {
            return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        courseRepo.deleteById(courseId);
    }
}
