package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.NvaaOption;

@Repository
public interface NvaaOptionRepository extends PagingAndSortingRepository<NvaaOption, Long>
{

}
