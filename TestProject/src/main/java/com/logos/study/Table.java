package com.logos.study;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Table {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String firstName;
	String lastName;
}
