package in.batur.tempus.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.batur.tempus.entity.WorkType;
import in.batur.tempus.service.WorkTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/worktype")
public class WorkTypeController 
{
Logger logger = LoggerFactory.getLogger(WorkTypeController.class);
	
	@Autowired
	private WorkTypeService workTypeService;
	
	@GetMapping
	public List<WorkType> findAll()
	{
		return workTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public WorkType getWorkTypeById(@PathVariable Long id) 
	{
		WorkType workType = workTypeService.findWorkTypeById(id);
		if (workType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return workType;
	}
	
	@PostMapping
	public WorkType saveWorkType(@Valid @RequestBody WorkType workType) 
	{
		return workTypeService.saveWorkType(workType);
	}
	
	@PutMapping
	public void updateWorkType(@Valid @RequestBody WorkType workType) 
	{
		workTypeService.saveWorkType(workType);
	}

	@DeleteMapping("/{id}")
	public void deleteWorkType(@PathVariable Long id) 
	{
		workTypeService.deleteWorkType(id);
	}
}
