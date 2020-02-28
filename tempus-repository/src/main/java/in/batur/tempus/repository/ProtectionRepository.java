package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Protection;

@Repository
public interface ProtectionRepository extends PagingAndSortingRepository<Protection, Long>
{

}
