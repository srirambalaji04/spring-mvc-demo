package com.springmvc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "t_user_roles", schema = "public")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRolesEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_role_id")
	private Integer userRoleId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = false)
	private UserDetailsEntity userDetailsEntity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id", nullable = false)
	private RolesEntity rolesEntity;
}
