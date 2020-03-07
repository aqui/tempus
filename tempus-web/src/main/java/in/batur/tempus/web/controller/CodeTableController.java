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

import in.batur.tempus.entity.CodeTable;
import in.batur.tempus.service.CodeTableService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/codetable")
public class CodeTableController 
{
Logger logger = LoggerFactory.getLogger(CodeTableController.class);
	
	@Autowired
	private CodeTableService codeTableService;
	
	@GetMapping
	public List<CodeTable> findAll()
	{
		return codeTableService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public CodeTable getCodeTableById(@PathVariable Long id) 
	{
		CodeTable codeTable = codeTableService.findCodeTableById(id);
		if (codeTable == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return codeTable;
	}
	
	@PostMapping("/")
	public CodeTable saveCodeTable(@Valid @RequestBody CodeTable codeTable) 
	{
		return codeTableService.saveCodeTable(codeTable);
	}
	
	@PutMapping("/")
	public CodeTable updateCodeTable(@Valid @RequestBody CodeTable codeTable) 
	{
		return codeTableService.saveCodeTable(codeTable);
	}

	@DeleteMapping("/{id}")
	public void deleteCodeTable(@PathVariable Long id) 
	{
		codeTableService.deleteCodeTable(id);
	}
}
