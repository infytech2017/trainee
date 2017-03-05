package com.infy.vivah.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infy.vivah.domain.Candidate;
import com.infy.vivah.mapper.CandidateRowMapper;

@Repository
public class PayrollExportReaderDaoImpl implements PayrollExportReaderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String FETCH_CANDIDATE = "select first_name,father_name, last_name, dob, city from candidate where id=?";

	public List<Candidate> getCandidate(Integer id) {
		Object[] queryParam = new Object[] { id };
		CandidateRowMapper rowMapper = new CandidateRowMapper();
		return jdbcTemplate.query(FETCH_CANDIDATE, queryParam, rowMapper);
	}
}
