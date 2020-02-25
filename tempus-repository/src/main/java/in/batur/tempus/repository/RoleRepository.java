package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Role;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>
{

}
