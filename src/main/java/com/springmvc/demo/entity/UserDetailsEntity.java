package com.springmvc.demo.entity;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "t_user_details", schema = "public")
@Getter
@Setter
@ToString(exclude = "userRoles")
@EqualsAndHashCode(callSuper = false)
public class UserDetailsEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name")
	@NotBlank(message = "Username cannot be empty")
	private String userName;

	@Column(name = "password")
	@NotBlank(message = "Password cannot be empty")
	private String password;

	@OneToMany(mappedBy = "userDetailsEntity")
	private Collection<UserRolesEntity> userRoles = new HashSet<>();
	
	public void addUserRole(UserRolesEntity userRolesEntity) {
		this.userRoles.add(userRolesEntity);
	}
}
