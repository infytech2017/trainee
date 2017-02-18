package com.infy.vivah.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.infy.vivah.dao.PayrollExportReaderDao;
import com.infy.vivah.domain.Candidate;

@Component
public class PayrollExportProcessor {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Autowired
	PayrollExportReaderDao candidateDao;

	// User Request End Service URL -Default
	public String welcomePage() { // request
		return "welcome";
		// logical view name (actual view =prefix+logicalview+suffix)
	} // User Request End Service URL

	public List<Candidate> getCandidate(Integer id) { // request
														// handling/processing
		List<Candidate> candidateList = candidateDao.getCandidate(id);
		return candidateList; // logical view name (actual view
								// =prefix+logicalview+suffix)
	}
}