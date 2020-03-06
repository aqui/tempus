package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Role;
import in.batur.tempus.repository.RoleRepository;
import in.batur.tempus.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService
{
	Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
    private RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() 
	{
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Role findRoleById(Long id) 
	{
		Optional<Role> role = roleRepository.findById(id);
		if (role.isPresent())
		{
			return role.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Role saveRole(Role role) 
	{
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(Long id) 
	{
		roleRepository.deleteById(id);
	}
}
