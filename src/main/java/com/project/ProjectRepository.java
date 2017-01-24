package com.project;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Binay Mishra
 *
 */
public interface ProjectRepository extends MongoRepository<Project, String> {
	
	
}
