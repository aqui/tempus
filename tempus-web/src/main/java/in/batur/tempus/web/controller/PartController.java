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

import in.batur.tempus.entity.Part;
import in.batur.tempus.service.PartService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/part")
public class PartController 
{
Logger logger = LoggerFactory.getLogger(PartController.class);
	
	@Autowired
	private PartService partService;
	
	@GetMapping
	public List<Part> findAll()
	{
		return partService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Part getPartById(@PathVariable Long id) 
	{
		Part part = partService.findPartById(id);
		if (part == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return part;
	}
	
	@PostMapping("/")
	public Part savePart(@Valid @RequestBody Part part) 
	{
		return partService.savePart(part);
	}
	
	@PutMapping("/")
	public Part updatePart(@Valid @RequestBody Part part) 
	{
		return partService.savePart(part);
	}

	@DeleteMapping("/{id}")
	public void deletePart(@PathVariable Long id) 
	{
		partService.deletePart(id);
	}
}
