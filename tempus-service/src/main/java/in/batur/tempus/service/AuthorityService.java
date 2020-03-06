package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Authority;

public interface AuthorityService
{
	public List<Authority> findAll();
	public Authority findAuthorityById(Long id);
	public Authority saveAuthority(Authority authority);
	public void deleteAuthority(Long id);
}
