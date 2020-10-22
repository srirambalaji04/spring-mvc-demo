package com.springmvc.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "created_time")
	private Timestamp createdTime;

	@Column(name = "created_by")
	private String createdBy;

	@PrePersist
	protected void setCreatedTime() {
		this.createdTime = Timestamp.from(Instant.now());
	}

}
