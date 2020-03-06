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

import in.batur.tempus.entity.ShiftType;
import in.batur.tempus.service.ShiftTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/shifttype")
public class ShiftTypeController 
{
Logger logger = LoggerFactory.getLogger(ShiftTypeController.class);
	
	@Autowired
	private ShiftTypeService shiftTypeService;
	
	@GetMapping
	public List<ShiftType> findAll()
	{
		return shiftTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ShiftType getShiftTypeById(@PathVariable Long id) 
	{
		ShiftType shiftType = shiftTypeService.findShiftTypeById(id);
		if (shiftType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return shiftType;
	}
	
	@PostMapping
	public ShiftType saveShiftType(@Valid @RequestBody ShiftType shiftType) 
	{
		return shiftTypeService.saveShiftType(shiftType);
	}
	
	@PutMapping
	public void updateShiftType(@Valid @RequestBody ShiftType shiftType) 
	{
		shiftTypeService.saveShiftType(shiftType);
	}

	@DeleteMapping("/{id}")
	public void deleteShiftType(@PathVariable Long id) 
	{
		shiftTypeService.deleteShiftType(id);
	}
}
