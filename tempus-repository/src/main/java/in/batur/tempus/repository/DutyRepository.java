package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Duty;

@Repository
public interface DutyRepository extends PagingAndSortingRepository<Duty, Long>
{

}
