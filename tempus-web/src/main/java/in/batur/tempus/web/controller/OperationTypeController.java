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

import in.batur.tempus.entity.OperationType;
import in.batur.tempus.service.OperationTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/operationtype")
public class OperationTypeController 
{
Logger logger = LoggerFactory.getLogger(OperationTypeController.class);
	
	@Autowired
	private OperationTypeService operationTypeService;
	
	@GetMapping
	public List<OperationType> findAll()
	{
		return operationTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public OperationType getOperationTypeById(@PathVariable Long id) 
	{
		OperationType operationType = operationTypeService.findOperationTypeById(id);
		if (operationType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return operationType;
	}
	
	@PostMapping
	public OperationType saveOperationType(@Valid @RequestBody OperationType operationType) 
	{
		return operationTypeService.saveOperationType(operationType);
	}
	
	@PutMapping
	public void updateOperationType(@Valid @RequestBody OperationType operationType) 
	{
		operationTypeService.saveOperationType(operationType);
	}

	@DeleteMapping("/{id}")
	public void deleteOperationType(@PathVariable Long id) 
	{
		operationTypeService.deleteOperationType(id);
	}
}
