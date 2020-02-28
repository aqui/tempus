package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.AnalysisType;

@Repository
public interface AnalysisTypeRepository extends PagingAndSortingRepository<AnalysisType, Long>{

}
