package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Users {
	@Id
	private String name;
	@Email
	private String email;
    private long number;
}
