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

import in.batur.tempus.entity.HolidayType;
import in.batur.tempus.service.HolidayTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/holidaytype")
public class HolidayTypeController 
{
Logger logger = LoggerFactory.getLogger(HolidayTypeController.class);
	
	@Autowired
	private HolidayTypeService holidayTypeService;
	
	@GetMapping
	public List<HolidayType> findAll()
	{
		return holidayTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public HolidayType getHolidayTypeById(@PathVariable Long id) 
	{
		HolidayType holidayType = holidayTypeService.findHolidayTypeById(id);
		if (holidayType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return holidayType;
	}
	
	@PostMapping("/")
	public HolidayType saveHolidayType(@Valid @RequestBody HolidayType holidayType) 
	{
		return holidayTypeService.saveHolidayType(holidayType);
	}
	
	@PutMapping("/")
	public HolidayType updateHolidayType(@Valid @RequestBody HolidayType holidayType) 
	{
		return holidayTypeService.saveHolidayType(holidayType);
	}

	@DeleteMapping("/{id}")
	public void deleteHolidayType(@PathVariable Long id) 
	{
		holidayTypeService.deleteHolidayType(id);
	}
}
