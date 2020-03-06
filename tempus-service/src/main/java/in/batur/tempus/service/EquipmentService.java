package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Equipment;

public interface EquipmentService
{
	public List<Equipment> findAll();
	public Equipment findEquipmentById(Long id);
	public Equipment saveEquipment(Equipment equipment);
	public void deleteEquipment(Long id);
}
