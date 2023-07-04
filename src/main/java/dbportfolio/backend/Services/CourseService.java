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

    public boolean deleteCourseById(Integer id) {
        if(!courseRepo.findById(id).isEmpty()) {
            courseRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public Course updateCourse(Course newCourse, Integer id) {
        Course oldCourse = courseRepo.findById(id).get();
        if(oldCourse != null) {
            oldCourse.setDesc(newCourse.getDesc());
            oldCourse.setName(newCourse.getName());
            oldCourse.setYear(newCourse.getYear());
            return oldCourse;
        }
        return null;
    }
}
