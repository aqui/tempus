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

import in.batur.tempus.entity.Line;
import in.batur.tempus.service.LineService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/line")
public class LineController 
{
Logger logger = LoggerFactory.getLogger(LineController.class);
	
	@Autowired
	private LineService lineService;
	
	@GetMapping
	public List<Line> findAll()
	{
		return lineService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Line getLineById(@PathVariable Long id) 
	{
		Line line = lineService.findLineById(id);
		if (line == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return line;
	}
	
	@PostMapping("/")
	public Line saveLine(@Valid @RequestBody Line line) 
	{
		return lineService.saveLine(line);
	}
	
	@PutMapping("/")
	public Line updateLine(@Valid @RequestBody Line line) 
	{
		return lineService.saveLine(line);
	}

	@DeleteMapping("/{id}")
	public void deleteLine(@PathVariable Long id) 
	{
		lineService.deleteLine(id);
	}
}
