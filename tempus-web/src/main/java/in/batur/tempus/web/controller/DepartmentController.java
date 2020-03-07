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

import in.batur.tempus.entity.Department;
import in.batur.tempus.service.DepartmentService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController 
{
Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService holidayService;
	
	@GetMapping
	public List<Department> findAll()
	{
		return holidayService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Department getDepartmentById(@PathVariable Long id) 
	{
		Department holiday = holidayService.findDepartmentById(id);
		if (holiday == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return holiday;
	}
	
	@PostMapping("/")
	public Department saveDepartment(@Valid @RequestBody Department holiday) 
	{
		return holidayService.saveDepartment(holiday);
	}
	
	@PutMapping("/")
	public Department updateDepartment(@Valid @RequestBody Department holiday) 
	{
		return holidayService.saveDepartment(holiday);
	}

	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Long id) 
	{
		holidayService.deleteDepartment(id);
	}
}
