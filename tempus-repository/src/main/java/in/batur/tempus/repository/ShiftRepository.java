package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Shift;

@Repository
public interface ShiftRepository extends PagingAndSortingRepository<Shift, Long>
{

}
