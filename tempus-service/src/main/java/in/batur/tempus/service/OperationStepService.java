package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.OperationStep;

public interface OperationStepService
{
	public List<OperationStep> findAll();
	public OperationStep findOperationStepById(Long id);
	public OperationStep saveOperationStep(OperationStep operationStep);
	public void deleteOperationStep(Long id);
}
