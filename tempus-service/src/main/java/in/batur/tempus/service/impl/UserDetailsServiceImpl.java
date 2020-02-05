package in.batur.tempus.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.User;
import in.batur.tempus.entity.UserDetailsImpl;
import in.batur.tempus.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService 
{
	Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow(()->new UsernameNotFoundException("User Not Found: "+username));
		return user.map(UserDetailsImpl::new).get();
	}
}
