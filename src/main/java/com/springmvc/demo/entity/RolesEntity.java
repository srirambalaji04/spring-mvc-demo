package com.springmvc.demo.entity;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "t_roles", schema = "public")
@Getter
@Setter
@ToString(exclude = "userRoles")
@EqualsAndHashCode(callSuper = false)
public class RolesEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "role_id")
	private Integer roleId;

	@Column(name = "role_name")
	private String roleName;

	@OneToMany(mappedBy = "rolesEntity")
	private Collection<UserRolesEntity> userRoles = new HashSet<>();

	public void addUserRole(UserRolesEntity userRoles) {
		this.userRoles.add(userRoles);
	}

}
