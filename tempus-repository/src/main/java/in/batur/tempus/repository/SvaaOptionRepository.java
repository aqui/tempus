package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.SvaaOption;

@Repository
public interface SvaaOptionRepository extends PagingAndSortingRepository<SvaaOption, Long>
{

}
