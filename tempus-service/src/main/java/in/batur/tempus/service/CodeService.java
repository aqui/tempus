package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Code;

public interface CodeService
{
	public List<Code> findAll();
	public Code findCodeById(Long id);
	public Code saveCode(Code holiday);
	public void deleteCode(Long id);
}
