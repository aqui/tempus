package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Part;

@Repository
public interface PartRepository extends PagingAndSortingRepository<Part, Long>
{

}
