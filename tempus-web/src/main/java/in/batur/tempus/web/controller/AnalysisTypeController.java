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

import in.batur.tempus.entity.AnalysisType;
import in.batur.tempus.service.AnalysisTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/analysistype")
public class AnalysisTypeController 
{
	Logger logger = LoggerFactory.getLogger(AnalysisTypeController.class);
	
	@Autowired
	private AnalysisTypeService analysisTypeService;
	
	@GetMapping
	public List<AnalysisType> findAll()
	{
		return analysisTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public AnalysisType getAnalysisTypeById(@PathVariable Long id) 
	{
		AnalysisType analysisType = analysisTypeService.findAnalysisTypeById(id);
		if (analysisType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return analysisType;
	}
	
	@PostMapping("/")
	public AnalysisType saveAnalysisType(@Valid @RequestBody AnalysisType analysisType) 
	{
		return analysisTypeService.saveAnalysisType(analysisType);
	}
	
	@PutMapping("/")
	public AnalysisType updateAnalysisType(@Valid @RequestBody AnalysisType analysisType) 
	{
		return analysisTypeService.saveAnalysisType(analysisType);
	}

	@DeleteMapping("/{id}")
	public void deleteAnalysisType(@PathVariable Long id) 
	{
		analysisTypeService.deleteAnalysisType(id);
	}
}
