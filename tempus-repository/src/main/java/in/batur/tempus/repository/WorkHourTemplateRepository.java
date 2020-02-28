package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.WorkHourTemplate;

@Repository
public interface WorkHourTemplateRepository extends PagingAndSortingRepository<WorkHourTemplate, Long>
{

}
