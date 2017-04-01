package com.infy.ioc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infy.ioc.domain.Candidate;

public class CandidateByCityRowMapper implements RowMapper<Candidate> {

	@Override
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Candidate candidate = new Candidate();
		candidate.setId(rs.getInt("Id"));
		candidate.setFirstName(rs.getString("first_name"));
		candidate.setLastName(rs.getString("last_name"));
		candidate.setDateOfBirth(rs.getString("dob"));
		candidate.setPermanentAddress(rs.getString("PERMANENT_ADDRESS"));
		return candidate;
	}
}
