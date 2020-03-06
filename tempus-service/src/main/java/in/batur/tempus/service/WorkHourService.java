package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.WorkHour;

public interface WorkHourService
{
	public List<WorkHour> findAll();
	public WorkHour findWorkHourById(Long id);
	public WorkHour saveWorkHour(WorkHour workHour);
	public void deleteWorkHour(Long id);
}
