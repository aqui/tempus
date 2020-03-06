package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Employee;

public interface EmployeeService
{
	public List<Employee> findAll();
	public Employee findEmployeeById(Long id);
	public Employee saveEmployee(Employee employee);
	public void deleteEmployee(Long id);
}
