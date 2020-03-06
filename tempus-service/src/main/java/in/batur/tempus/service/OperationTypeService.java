package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.OperationType;

public interface OperationTypeService
{
	public List<OperationType> findAll();
	public OperationType findOperationTypeById(Long id);
	public OperationType saveOperationType(OperationType operationType);
	public void deleteOperationType(Long id);
}
