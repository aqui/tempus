package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Code;

@Repository
public interface CodeRepository extends PagingAndSortingRepository<Code, Long>
{

}
