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

import in.batur.tempus.entity.Employee;
import in.batur.tempus.service.EmployeeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController 
{
Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Employee getEmployeeById(@PathVariable Long id) 
	{
		Employee employee = employeeService.findEmployeeById(id);
		if (employee == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return employee;
	}
	
	@PostMapping
	public Employee saveEmployee(@Valid @RequestBody Employee employee) 
	{
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping
	public void updateEmployee(@Valid @RequestBody Employee employee) 
	{
		employeeService.saveEmployee(employee);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) 
	{
		employeeService.deleteEmployee(id);
	}
}
