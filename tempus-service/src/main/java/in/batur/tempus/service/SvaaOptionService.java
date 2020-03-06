package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.SvaaOption;

public interface SvaaOptionService
{
	public List<SvaaOption> findAll();
	public SvaaOption findSvaaOptionById(Long id);
	public SvaaOption saveSvaaOption(SvaaOption svaaOption);
	public void deleteSvaaOption(Long id);
}
