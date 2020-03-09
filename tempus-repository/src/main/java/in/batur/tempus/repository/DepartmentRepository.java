package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Department;

@Repository
@Transactional
public interface DepartmentRepository extends BaseRepository<Department>
{

}
