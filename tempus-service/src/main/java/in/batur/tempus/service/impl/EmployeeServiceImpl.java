package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Employee;
import in.batur.tempus.repository.EmployeeRepository;
import in.batur.tempus.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() 
	{
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(Long id) 
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent())
		{
			return employee.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Employee saveEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) 
	{
		employeeRepository.deleteById(id);
	}
}
