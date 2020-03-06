package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.WorkHourTemplate;

public interface WorkHourTemplateService
{
	public List<WorkHourTemplate> findAll();
	public WorkHourTemplate findWorkHourTemplateById(Long id);
	public WorkHourTemplate saveWorkHourTemplate(WorkHourTemplate workHourTemplate);
	public void deleteWorkHourTemplate(Long id);
}
