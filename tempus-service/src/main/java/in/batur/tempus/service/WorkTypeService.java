package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.WorkType;

public interface WorkTypeService
{
	public List<WorkType> findAll();
	public WorkType findWorkTypeById(Long id);
	public WorkType saveWorkType(WorkType workType);
	public void deleteWorkType(Long id);
}
