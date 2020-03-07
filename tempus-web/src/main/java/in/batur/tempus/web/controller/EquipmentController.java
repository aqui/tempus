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

import in.batur.tempus.entity.Equipment;
import in.batur.tempus.service.EquipmentService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/equipment")
public class EquipmentController 
{
	Logger logger = LoggerFactory.getLogger(EquipmentController.class);
	
	@Autowired
	private EquipmentService equipmentService;
	
	@GetMapping
	public List<Equipment> findAll()
	{
		return equipmentService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Equipment getEquipmentById(@PathVariable Long id) 
	{
		Equipment equipment = equipmentService.findEquipmentById(id);
		if (equipment == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return equipment;
	}
	
	@PostMapping("/")
	public Equipment saveEquipment(@Valid @RequestBody Equipment equipment) 
	{
		return equipmentService.saveEquipment(equipment);
	}
	
	@PutMapping("/")
	public Equipment updateEquipment(@Valid @RequestBody Equipment equipment) 
	{
		return equipmentService.saveEquipment(equipment);
	}

	@DeleteMapping("/{id}")
	public void deleteEquipment(@PathVariable Long id) 
	{
		equipmentService.deleteEquipment(id);
	}
}
