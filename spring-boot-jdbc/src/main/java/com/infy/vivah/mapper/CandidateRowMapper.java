package com.infy.vivah.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infy.vivah.domain.Candidate;

public class CandidateRowMapper implements RowMapper<Candidate> {

	@Override
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Candidate c = new Candidate();
		c.setFirstName(rs.getString("first_name"));
		c.setFatherName(rs.getString("father_name"));
		c.setLastName(rs.getString("last_name"));
		c.setDateOfBirth(rs.getString("dob"));
		c.setCity(rs.getString("city"));
		return c;
	}
}
