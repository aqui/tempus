package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Shift;

public interface ShiftService
{
	public List<Shift> findAll();
	public Shift findShiftById(Long id);
	public Shift saveShift(Shift shift);
	public void deleteShift(Long id);
}
