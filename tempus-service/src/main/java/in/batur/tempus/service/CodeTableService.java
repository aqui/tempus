package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.CodeTable;

public interface CodeTableService
{
	public List<CodeTable> findAll();
	public CodeTable findCodeTableById(Long id);
	public CodeTable saveCodeTable(CodeTable codeTable);
	public void deleteCodeTable(Long id);
}
