package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.WorkType;

@Repository
public interface WorkTypeRepository extends PagingAndSortingRepository<WorkType, Long>
{

}