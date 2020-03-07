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

import in.batur.tempus.entity.Shift;
import in.batur.tempus.service.ShiftService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/shift")
public class ShiftController 
{
Logger logger = LoggerFactory.getLogger(ShiftController.class);
	
	@Autowired
	private ShiftService shiftService;
	
	@GetMapping
	public List<Shift> findAll()
	{
		return shiftService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Shift getShiftById(@PathVariable Long id) 
	{
		Shift shift = shiftService.findShiftById(id);
		if (shift == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return shift;
	}
	
	@PostMapping("/")
	public Shift saveShift(@Valid @RequestBody Shift shift) 
	{
		return shiftService.saveShift(shift);
	}
	
	@PutMapping("/")
	public Shift updateShift(@Valid @RequestBody Shift shift) 
	{
		return shiftService.saveShift(shift);
	}

	@DeleteMapping("/{id}")
	public void deleteShift(@PathVariable Long id) 
	{
		shiftService.deleteShift(id);
	}
}
