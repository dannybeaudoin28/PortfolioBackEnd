package dbportfolio.backend.Repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import dbportfolio.backend.Models.Course;

@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {
    
}
