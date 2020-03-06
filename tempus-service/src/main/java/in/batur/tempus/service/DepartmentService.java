package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Department;

public interface DepartmentService
{
	public List<Department> findAll();
	public Department findDepartmentById(Long id);
	public Department saveDepartment(Department department);
	public void deleteDepartment(Long id);
}
