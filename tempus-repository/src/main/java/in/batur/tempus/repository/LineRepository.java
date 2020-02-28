package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Line;

@Repository
public interface LineRepository extends PagingAndSortingRepository<Line, Long>
{

}
