package com.springmvc.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer loginId;

	@Column(name = "username")
	@NotBlank(message = "Username cannot be empty")
	@Length(min = 5, max = 5, message = "Username should be 5 characters length")
	private String username;

	@NotBlank(message = "Password cannot be empty")
	private String password;

	private Timestamp createdTime;

}
