package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Role;

public interface RoleService 
{
	public List<Role> findAll();
	public Role findRoleById(Long id);
	public Role saveRole(Role role);
	public void deleteRole(Long id);
}
