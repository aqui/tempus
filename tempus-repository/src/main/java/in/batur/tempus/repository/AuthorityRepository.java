package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Authority;

@Repository
public interface AuthorityRepository extends PagingAndSortingRepository<Authority, Long>
{

}
