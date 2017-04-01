package com.infy.vivah.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.vivah.domain.Candidate;

@RestController
public class RestCandidateService {

	// REST End Point- exposing data to client/user for request.
	@RequestMapping("/candidate")
	public Candidate getCandidate(@RequestParam(value = "id", defaultValue = "0") Integer id) {
		// If request is without id then default value for id is 0.
		Candidate candidate = new Candidate();
		candidate.setFirstName("Shesh");
		candidate.setFirstName("Talmale");
		return candidate;
	}
}
