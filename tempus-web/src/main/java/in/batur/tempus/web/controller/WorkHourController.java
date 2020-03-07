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

import in.batur.tempus.entity.WorkHour;
import in.batur.tempus.service.WorkHourService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/workhour")
public class WorkHourController 
{
Logger logger = LoggerFactory.getLogger(WorkHourController.class);
	
	@Autowired
	private WorkHourService workHourService;
	
	@GetMapping
	public List<WorkHour> findAll()
	{
		return workHourService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public WorkHour getWorkHourById(@PathVariable Long id) 
	{
		WorkHour workHour = workHourService.findWorkHourById(id);
		if (workHour == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return workHour;
	}
	
	@PostMapping("/")
	public WorkHour saveWorkHour(@Valid @RequestBody WorkHour workHour) 
	{
		return workHourService.saveWorkHour(workHour);
	}
	
	@PutMapping("/")
	public WorkHour updateWorkHour(@Valid @RequestBody WorkHour workHour) 
	{
		return workHourService.saveWorkHour(workHour);
	}

	@DeleteMapping("/{id}")
	public void deleteWorkHour(@PathVariable Long id) 
	{
		workHourService.deleteWorkHour(id);
	}
}
