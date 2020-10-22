package com.springmvc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "t_team_information", schema = "public")
@EqualsAndHashCode(callSuper = false)
@Data
public class TeamInformationEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "team_member_id")
	private Integer teamMemberId;

	@Column(name = "resource_name")
	@NotBlank(message = "Resource Name cannot be empty")
	private String resourceName;

	@Column(name = "age")
	private Integer age;

	@Column(name = "gender")
	private Character gender;

	@Column(name = "application_role")
	private Integer applicationRole;

	@Column(name = "experience")
	private Integer experience;

}
