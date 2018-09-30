package com.example.jdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccountInfo {
	
	private Long id;
	private String fullName;
	private double balance;
	
	public BankAccountInfo(Long id, String fullName, double balance) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.balance = balance;
	}

}
