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

import in.batur.tempus.entity.SvaaOption;
import in.batur.tempus.service.SvaaOptionService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/svaaoption")
public class SvaaOptionController 
{
Logger logger = LoggerFactory.getLogger(SvaaOptionController.class);
	
	@Autowired
	private SvaaOptionService svaaOptionService;
	
	@GetMapping
	public List<SvaaOption> findAll()
	{
		return svaaOptionService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public SvaaOption getSvaaOptionById(@PathVariable Long id) 
	{
		SvaaOption svaaOption = svaaOptionService.findSvaaOptionById(id);
		if (svaaOption == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return svaaOption;
	}
	
	@PostMapping
	public SvaaOption saveSvaaOption(@Valid @RequestBody SvaaOption svaaOption) 
	{
		return svaaOptionService.saveSvaaOption(svaaOption);
	}
	
	@PutMapping
	public void updateSvaaOption(@Valid @RequestBody SvaaOption svaaOption) 
	{
		svaaOptionService.saveSvaaOption(svaaOption);
	}

	@DeleteMapping("/{id}")
	public void deleteSvaaOption(@PathVariable Long id) 
	{
		svaaOptionService.deleteSvaaOption(id);
	}
}
