package com.project;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Binay Mishra
 *
 */
@RepositoryRestResource(collectionResourceRel = "project", path = "project")
public interface ProjectRepository extends MongoRepository<Project, Integer> {
	
	List<Project> findById(@Param("id") Integer id);
}
