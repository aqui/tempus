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

import in.batur.tempus.entity.Warehouse;
import in.batur.tempus.service.WarehouseService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/warehouse")
public class WarehouseController 
{
Logger logger = LoggerFactory.getLogger(WarehouseController.class);
	
	@Autowired
	private WarehouseService warehouseService;
	
	@GetMapping
	public List<Warehouse> findAll()
	{
		return warehouseService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Warehouse getWarehouseById(@PathVariable Long id) 
	{
		Warehouse warehouse = warehouseService.findWarehouseById(id);
		if (warehouse == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return warehouse;
	}
	
	@PostMapping("/")
	public Warehouse saveWarehouse(@Valid @RequestBody Warehouse warehouse) 
	{
		return warehouseService.saveWarehouse(warehouse);
	}
	
	@PutMapping("/")
	public Warehouse updateWarehouse(@Valid @RequestBody Warehouse warehouse) 
	{
		return warehouseService.saveWarehouse(warehouse);
	}

	@DeleteMapping("/{id}")
	public void deleteWarehouse(@PathVariable Long id) 
	{
		warehouseService.deleteWarehouse(id);
	}
}
