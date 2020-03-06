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

import in.batur.tempus.entity.Code;
import in.batur.tempus.service.CodeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/code")
public class CodeController 
{
Logger logger = LoggerFactory.getLogger(CodeController.class);
	
	@Autowired
	private CodeService codeService;
	
	@GetMapping
	public List<Code> findAll()
	{
		return codeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Code getCodeById(@PathVariable Long id) 
	{
		Code code = codeService.findCodeById(id);
		if (code == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return code;
	}
	
	@PostMapping
	public Code saveCode(@Valid @RequestBody Code code) 
	{
		return codeService.saveCode(code);
	}
	
	@PutMapping
	public void updateCode(@Valid @RequestBody Code code) 
	{
		codeService.saveCode(code);
	}

	@DeleteMapping("/{id}")
	public void deleteCode(@PathVariable Long id) 
	{
		codeService.deleteCode(id);
	}
}
