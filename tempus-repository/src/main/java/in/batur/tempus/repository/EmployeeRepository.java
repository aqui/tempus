package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends BaseRepository<Employee>
{

}
