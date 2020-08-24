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
public class PurchaseReport {

	@Id
	@GeneratedValue
	private int reportid;
	private String category;
	private int unitspurchased;
}
