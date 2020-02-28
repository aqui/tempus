package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Department;

@Repository
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long>
{

}
