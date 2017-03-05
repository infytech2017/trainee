package com.infy.vivah.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.infy.vivah.domain.Candidate;

@Repository
public interface PayrollExportReaderDao {
	public List<Candidate> getCandidate(Integer id);
}
