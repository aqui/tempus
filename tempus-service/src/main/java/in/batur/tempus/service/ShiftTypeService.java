package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.ShiftType;

public interface ShiftTypeService
{
	public List<ShiftType> findAll();
	public ShiftType findShiftTypeById(Long id);
	public ShiftType saveShiftType(ShiftType shiftType);
	public void deleteShiftType(Long id);
}
