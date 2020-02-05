package in.batur.tempus.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails
{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private boolean enabled;
	private List<GrantedAuthority> authorities;
	private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    
	public UserDetailsImpl() 
	{
		
	}
	
	public UserDetailsImpl(User user) 
	{
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.enabled = user.isEnabled();
		this.authorities  = new ArrayList<GrantedAuthority>();
		for (Role role : user.getRoles()) 
		{
			this.authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		this.accountNonExpired = user.isAccountNonExpired();
		this.accountNonLocked = user.isAccountNonLocked();
		this.credentialsNonExpired = user.isCredentialsNonExpired();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}
}
