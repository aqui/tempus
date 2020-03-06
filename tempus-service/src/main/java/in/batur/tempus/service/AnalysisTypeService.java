package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.AnalysisType;

public interface AnalysisTypeService
{
	public List<AnalysisType> findAll();
	public AnalysisType findAnalysisTypeById(Long id);
	public AnalysisType saveAnalysisType(AnalysisType analysisType);
	public void deleteAnalysisType(Long id);
}
