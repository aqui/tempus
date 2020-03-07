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

import in.batur.tempus.entity.Operation;
import in.batur.tempus.service.OperationService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/operation")
public class OperationController 
{
Logger logger = LoggerFactory.getLogger(OperationController.class);
	
	@Autowired
	private OperationService holidayService;
	
	@GetMapping
	public List<Operation> findAll()
	{
		return holidayService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Operation getOperationById(@PathVariable Long id) 
	{
		Operation holiday = holidayService.findOperationById(id);
		if (holiday == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return holiday;
	}
	
	@PostMapping("/")
	public Operation saveOperation(@Valid @RequestBody Operation holiday) 
	{
		return holidayService.saveOperation(holiday);
	}
	
	@PutMapping("/")
	public Operation updateOperation(@Valid @RequestBody Operation holiday) 
	{
		return holidayService.saveOperation(holiday);
	}

	@DeleteMapping("/{id}")
	public void deleteOperation(@PathVariable Long id) 
	{
		holidayService.deleteOperation(id);
	}
}
