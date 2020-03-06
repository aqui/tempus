package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.User;

public interface UserService 
{
	public List<User> findAll();
	public User findUserById(Long id);
	public User saveUser(User user);
	public void deleteUser(Long id);
}
