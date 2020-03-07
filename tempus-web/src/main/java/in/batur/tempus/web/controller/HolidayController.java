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

import in.batur.tempus.entity.Holiday;
import in.batur.tempus.service.HolidayService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/holiday")
public class HolidayController 
{
	Logger logger = LoggerFactory.getLogger(HolidayController.class);
	
	@Autowired
	private HolidayService holidayService;
	
	@GetMapping
	public List<Holiday> findAll()
	{
		return holidayService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Holiday getHolidayById(@PathVariable Long id) 
	{
		Holiday holiday = holidayService.findHolidayById(id);
		if (holiday == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return holiday;
	}
	
	@PostMapping("/")
	public Holiday saveHoliday(@Valid @RequestBody Holiday holiday) 
	{
		return holidayService.saveHoliday(holiday);
	}
	
	@PutMapping("/")
	public Holiday updateHoliday(@Valid @RequestBody Holiday holiday) 
	{
		return holidayService.saveHoliday(holiday);
	}

	@DeleteMapping("/{id}")
	public void deleteHoliday(@PathVariable Long id) 
	{
		holidayService.deleteHoliday(id);
	}
}
