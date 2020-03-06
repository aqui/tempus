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

import in.batur.tempus.entity.Protection;
import in.batur.tempus.service.ProtectionService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/protection")
public class ProtectionController 
{
Logger logger = LoggerFactory.getLogger(ProtectionController.class);
	
	@Autowired
	private ProtectionService protectionService;
	
	@GetMapping
	public List<Protection> findAll()
	{
		return protectionService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Protection getProtectionById(@PathVariable Long id) 
	{
		Protection protection = protectionService.findProtectionById(id);
		if (protection == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return protection;
	}
	
	@PostMapping
	public Protection saveProtection(@Valid @RequestBody Protection protection) 
	{
		return protectionService.saveProtection(protection);
	}
	
	@PutMapping
	public void updateProtection(@Valid @RequestBody Protection protection) 
	{
		protectionService.saveProtection(protection);
	}

	@DeleteMapping("/{id}")
	public void deleteProtection(@PathVariable Long id) 
	{
		protectionService.deleteProtection(id);
	}
}
