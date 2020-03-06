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

import in.batur.tempus.entity.Station;
import in.batur.tempus.service.StationService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/station")
public class StationController 
{
Logger logger = LoggerFactory.getLogger(StationController.class);
	
	@Autowired
	private StationService stationService;
	
	@GetMapping
	public List<Station> findAll()
	{
		return stationService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Station getStationById(@PathVariable Long id) 
	{
		Station station = stationService.findStationById(id);
		if (station == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return station;
	}
	
	@PostMapping
	public Station saveStation(@Valid @RequestBody Station station) 
	{
		return stationService.saveStation(station);
	}
	
	@PutMapping
	public void updateStation(@Valid @RequestBody Station station) 
	{
		stationService.saveStation(station);
	}

	@DeleteMapping("/{id}")
	public void deleteStation(@PathVariable Long id) 
	{
		stationService.deleteStation(id);
	}
}
