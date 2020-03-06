package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Equipment;
import in.batur.tempus.repository.EquipmentRepository;
import in.batur.tempus.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService 
{
	Logger logger = LoggerFactory.getLogger(EquipmentServiceImpl.class);

	@Autowired
    private EquipmentRepository equipmentRepository;
	
	@Override
	public List<Equipment> findAll() 
	{
		return (List<Equipment>) equipmentRepository.findAll();
	}

	@Override
	public Equipment findEquipmentById(Long id) 
	{
		Optional<Equipment> equipment = equipmentRepository.findById(id);
		if (equipment.isPresent())
		{
			return equipment.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Equipment saveEquipment(Equipment equipment) 
	{
		return equipmentRepository.save(equipment);
	}

	@Override
	public void deleteEquipment(Long id) 
	{
		equipmentRepository.deleteById(id);
	}
}
