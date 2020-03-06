package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Department;
import in.batur.tempus.repository.DepartmentRepository;
import in.batur.tempus.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService 
{
	Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	@Autowired
    private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> findAll() 
	{
		return (List<Department>) departmentRepository.findAll();
	}

	@Override
	public Department findDepartmentById(Long id) 
	{
		Optional<Department> department = departmentRepository.findById(id);
		if (department.isPresent())
		{
			return department.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Department saveDepartment(Department department) 
	{
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) 
	{
		departmentRepository.deleteById(id);
	}
}
