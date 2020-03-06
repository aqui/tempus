package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Operation;

public interface OperationService
{
	public List<Operation> findAll();
	public Operation findOperationById(Long id);
	public Operation saveOperation(Operation operation);
	public void deleteOperation(Long id);
}
