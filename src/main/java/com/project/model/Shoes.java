package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class Shoes {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int price;
	private String category;
}
