package com.example.jdbc.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SendMoneyForm {
	
	private Long fromAccountId;
	private Long toAccountId;
	private Double amount;
	
	public SendMoneyForm() {}
	
	public SendMoneyForm(Long fromAccountId, Long toAccountId, Double amount) {
		super();
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.amount = amount;
	}

}
