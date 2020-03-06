package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Part;

public interface PartService
{
	public List<Part> findAll();
	public Part findPartById(Long id);
	public Part savePart(Part part);
	public void deletePart(Long id);
}
