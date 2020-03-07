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

import in.batur.tempus.entity.OperationStep;
import in.batur.tempus.service.OperationStepService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/operationstep")
public class OperationStepController 
{
Logger logger = LoggerFactory.getLogger(OperationStepController.class);
	
	@Autowired
	private OperationStepService operationStepService;
	
	@GetMapping
	public List<OperationStep> findAll()
	{
		return operationStepService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public OperationStep getOperationStepById(@PathVariable Long id) 
	{
		OperationStep operationStep = operationStepService.findOperationStepById(id);
		if (operationStep == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return operationStep;
	}
	
	@PostMapping("/")
	public OperationStep saveOperationStep(@Valid @RequestBody OperationStep operationStep) 
	{
		return operationStepService.saveOperationStep(operationStep);
	}
	
	@PutMapping("/")
	public OperationStep updateOperationStep(@Valid @RequestBody OperationStep operationStep) 
	{
		return operationStepService.saveOperationStep(operationStep);
	}

	@DeleteMapping("/{id}")
	public void deleteOperationStep(@PathVariable Long id) 
	{
		operationStepService.deleteOperationStep(id);
	}
}
