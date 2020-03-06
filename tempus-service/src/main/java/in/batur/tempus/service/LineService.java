package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Line;

public interface LineService
{
	public List<Line> findAll();
	public Line findLineById(Long id);
	public Line saveLine(Line line);
	public void deleteLine(Long id);
}
