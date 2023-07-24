package dbportfolio.backend.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dbportfolio.backend.Models.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer> {
    
}
