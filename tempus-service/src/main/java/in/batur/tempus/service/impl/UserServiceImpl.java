package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.User;
import in.batur.tempus.repository.UserRepository;
import in.batur.tempus.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
    private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent())
		{
			return user.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
