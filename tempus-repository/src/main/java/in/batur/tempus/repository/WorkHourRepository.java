package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.WorkHour;

@Repository
public interface WorkHourRepository extends PagingAndSortingRepository<WorkHour, Long>
{

}
