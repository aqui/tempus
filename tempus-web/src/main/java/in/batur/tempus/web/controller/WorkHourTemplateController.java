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

import in.batur.tempus.entity.WorkHourTemplate;
import in.batur.tempus.service.WorkHourTemplateService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/workhourtemplate")
public class WorkHourTemplateController 
{
Logger logger = LoggerFactory.getLogger(WorkHourTemplateController.class);
	
	@Autowired
	private WorkHourTemplateService workHourTemplateService;
	
	@GetMapping
	public List<WorkHourTemplate> findAll()
	{
		return workHourTemplateService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public WorkHourTemplate getWorkHourTemplateById(@PathVariable Long id) 
	{
		WorkHourTemplate workHourTemplate = workHourTemplateService.findWorkHourTemplateById(id);
		if (workHourTemplate == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return workHourTemplate;
	}
	
	@PostMapping
	public WorkHourTemplate saveWorkHourTemplate(@Valid @RequestBody WorkHourTemplate workHourTemplate) 
	{
		return workHourTemplateService.saveWorkHourTemplate(workHourTemplate);
	}
	
	@PutMapping
	public void updateWorkHourTemplate(@Valid @RequestBody WorkHourTemplate workHourTemplate) 
	{
		workHourTemplateService.saveWorkHourTemplate(workHourTemplate);
	}

	@DeleteMapping("/{id}")
	public void deleteWorkHourTemplate(@PathVariable Long id) 
	{
		workHourTemplateService.deleteWorkHourTemplate(id);
	}
}
