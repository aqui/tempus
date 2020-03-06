package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Warehouse;
import in.batur.tempus.repository.WarehouseRepository;
import in.batur.tempus.service.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService 
{
	Logger logger = LoggerFactory.getLogger(WarehouseServiceImpl.class);

	@Autowired
    private WarehouseRepository warehouseRepository;
	
	@Override
	public List<Warehouse> findAll() 
	{
		return (List<Warehouse>) warehouseRepository.findAll();
	}

	@Override
	public Warehouse findWarehouseById(Long id) 
	{
		Optional<Warehouse> warehouse = warehouseRepository.findById(id);
		if (warehouse.isPresent())
		{
			return warehouse.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Warehouse saveWarehouse(Warehouse warehouse) 
	{
		return warehouseRepository.save(warehouse);
	}

	@Override
	public void deleteWarehouse(Long id) 
	{
		warehouseRepository.deleteById(id);
	}
}
