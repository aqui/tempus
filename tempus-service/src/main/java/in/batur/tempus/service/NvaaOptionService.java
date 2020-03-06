package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.NvaaOption;

public interface NvaaOptionService
{
	public List<NvaaOption> findAll();
	public NvaaOption findNvaaOptionById(Long id);
	public NvaaOption saveNvaaOption(NvaaOption nvaaOption);
	public void deleteNvaaOption(Long id);
}
