package com.springmvc.demo.entity;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;

	private Collection<UserRolesEntity> userRolesEntities;

	private UserDetailsEntity userDetailsEntity;

	public CustomUserDetails(Collection<UserRolesEntity> userRolesEntities) {
		super();
		this.userRolesEntities = userRolesEntities;
		this.userDetailsEntity = userRolesEntities.stream().findFirst()
				.map(userRoleEntity -> userRoleEntity.getUserDetailsEntity()).get();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return userRolesEntities.stream()
				.map(userRoles -> new SimpleGrantedAuthority(userRoles.getRolesEntity().getRoleName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return userDetailsEntity.getPassword();
	}

	@Override
	public String getUsername() {
		return userDetailsEntity.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public UserDetailsEntity getUserDetailsEntity() {
		return this.userDetailsEntity;
	}
}
