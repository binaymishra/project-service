package com.project;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Binay Mishra
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectRestController {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@PostMapping
	ResponseEntity<Void> createOne(@RequestBody Project project){
		if(project == null)
		return ResponseEntity.badRequest().build();
		
		project = projectRepository.save(project);
		System.out.println(String.format("Created => %s", project));
		return ResponseEntity.created(URI.create(String.format("http://localhost:3000/project/%s", project.getId()))).build();
	}
	
	@GetMapping
	ResponseEntity<List<Project>> findAllProjects(){
		List<Project> projects = projectRepository.findAll(new Sort(Direction.ASC, "name"));
		if(CollectionUtils.isEmpty(projects))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(projects);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Project> findOneById(@PathVariable("id") String id){
		Project result = projectRepository.findOne(id);
		if(result == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("/{id}")
	ResponseEntity<Void> updateOne(@RequestBody Project project, @PathVariable("id") String id){
		if(StringUtils.isEmpty(id) || project == null)
			return ResponseEntity.badRequest().build();
		
		Project result = projectRepository.findOne(id);
		project.setId(id);
		result.setName(project.getName());
		result.setResources(project.getResources());
		
		project = projectRepository.save(project);
		System.out.println(String.format("Updated => %s", project));
		return ResponseEntity.accepted().build();
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteOne(@PathVariable("id") String id){
		Project oneProject = projectRepository.findOne(id);
		Assert.notNull(oneProject);
		projectRepository.delete(oneProject);
		return ResponseEntity.accepted().build();
	}
	

}
