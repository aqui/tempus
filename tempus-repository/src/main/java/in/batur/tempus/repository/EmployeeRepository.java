package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>
{

}
