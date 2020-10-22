package com.springmvc.demo.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	private String resourceName;
	
	private Integer age;
	
	private Character gender;
	
	private Integer applicationRole;
	
	private Integer experience;
	
}
