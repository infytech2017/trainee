package com.infy.ioc.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infy.ioc.domain.Candidate;
import com.infy.ioc.mapper.CandidateByCityRowMapper;
import com.infy.ioc.mapper.CandidateRowMapper;

@Repository
public class CandidateDaoImpl implements CandidateDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String FETCH_CANDIDATE = "select first_name,father_name, last_name, dob, city from candidate where id=?";
	private final String FETCH_CANDIDATE_BY_CITY = "select Id,first_name, last_name, dob, PERMANENT_ADDRESS from candidate where city=?";
	private final String ADD_CANDIDATE = "INSERT INTO candidate (id, first_name, last_name) values (seq_candidate.nextval, ?, ?)";
	private final String DELETE_CANDIDATE = "DELETE FROM candidate WHERE id=?";

	public Integer deleteCandidate(Integer id) {
		int count = jdbcTemplate.update(DELETE_CANDIDATE, id);
		return count;
	}

	public List<Candidate> getCandidate(Integer id) {
		Object[] queryParam = new Object[] { id };
		CandidateRowMapper rowMapper = new CandidateRowMapper();
		return jdbcTemplate.query(FETCH_CANDIDATE, queryParam, rowMapper);
	}

	@Override
	public List<Candidate> getCandidateByCity(String city) {
		Object[] queryParam = new Object[] { city };
		CandidateByCityRowMapper rowMapper = new CandidateByCityRowMapper();
		return jdbcTemplate.query(FETCH_CANDIDATE_BY_CITY, queryParam, rowMapper);
	}

	@Override
	public Integer addCandidate(Candidate candidate) {
		// define query arguments
		Object[] params = new Object[] { candidate.getFirstName(), candidate.getLastName() };
		// define SQL types of the arguments
		int[] types = new int[] { Types.VARCHAR, Types.VARCHAR };

		// execute insert query to insert the data
		// return number of row / rows processed by the executed query
		int row = jdbcTemplate.update(ADD_CANDIDATE, params, types);
		return row;
	}
}
