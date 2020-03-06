package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Protection;

public interface ProtectionService
{
	public List<Protection> findAll();
	public Protection findProtectionById(Long id);
	public Protection saveProtection(Protection protection);
	public void deleteProtection(Long id);
}
