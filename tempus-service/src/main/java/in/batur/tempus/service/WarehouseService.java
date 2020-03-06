package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Warehouse;

public interface WarehouseService
{
	public List<Warehouse> findAll();
	public Warehouse findWarehouseById(Long id);
	public Warehouse saveWarehouse(Warehouse warehouse);
	public void deleteWarehouse(Long id);
}
