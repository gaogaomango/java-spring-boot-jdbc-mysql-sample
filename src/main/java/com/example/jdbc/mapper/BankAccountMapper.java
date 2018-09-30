package com.example.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.jdbc.model.BankAccountInfo;

public class BankAccountMapper implements RowMapper<BankAccountInfo> {
	
	public static final String BASE_SQL = "Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba ";
	
	@Override
	public BankAccountInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Long id = rs.getLong("id");
		String fullName = rs.getString("Full_Name");
		double balance = rs.getDouble("Balance");
		
		return new BankAccountInfo(id, fullName, balance);
	}
}
