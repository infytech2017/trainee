package com.infy.ioc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.infy.ioc.domain.Candidate;

@Repository
public interface CandidateDao {
	public List<Candidate> getCandidate(Integer id);
	public Integer deleteCandidate(Integer id);
	public List<Candidate> getCandidateByCity(String city);
	public Integer addCandidate(Candidate candidate);
}
