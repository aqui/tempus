package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Duty;

public interface DutyService
{
	public List<Duty> findAll();
	public Duty findDutyById(Long id);
	public Duty saveDuty(Duty duty);
	public void deleteDuty(Long id);
}
