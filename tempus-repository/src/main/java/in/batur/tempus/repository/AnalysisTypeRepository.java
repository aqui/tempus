package in.batur.tempus.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.batur.tempus.entity.AnalysisType;

@Repository
@Transactional
public interface AnalysisTypeRepository extends BaseRepository<AnalysisType>
{
	
}
