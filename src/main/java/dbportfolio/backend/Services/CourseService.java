package dbportfolio.backend.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbportfolio.backend.Models.Course;
import dbportfolio.backend.Repositories.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public Integer addCourse(Course course) {
        return this.courseRepo.save(course).getId();
    }

    public Course getCourseById(Integer id) {
        return this.courseRepo.findById(id).get();
    }

    public ArrayList<Course> getAllCourses() {
        return (ArrayList<Course>) this.courseRepo.findAll();
    }

    public void deleteCourseById(Integer id) {
        this.courseRepo.deleteById(id);
    }
}
