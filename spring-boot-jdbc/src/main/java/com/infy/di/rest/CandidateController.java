package com.infy.vivah.rest;

import com.infy.vivah.dao.CandidateDao;
import com.infy.vivah.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class CandidateController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Autowired
	CandidateDao candidateDao;

	@RequestMapping("/") // User Request End Service URL -Default
	public String welcomePage() { // request
		return "welcome";
		// logical view name (actual view =prefix+logicalview+suffix)
	}

	@RequestMapping("/getCandidate") // User Request End Service URL
	public String getCandidate(Map<String, Object> model, @RequestParam(value = "id", defaultValue = "0") Integer id) { // request
																														// handling/processing
		model.put("candidateId", id);
		List<Candidate> candidateList = candidateDao.getCandidate(id);
		model.put("candidateList", candidateList);
		return "profile_view"; // logical view name (actual view
								// =prefix+logicalview+suffix)
	}

	@RequestMapping("/getCandidateList") // User Request End Service URL
	public String getCandidateList(Map<String, Object> model,
			@RequestParam(value = "city", defaultValue = "Pune") String city) { // request
																				// handling/processing
		model.put("city", city);
		List<Candidate> candidateList = candidateDao.getCandidateByCity(city);
		model.put("candidateList", candidateList);
		return "profile_list_view"; // logical view name (actual view
									// =prefix+logicalview+suffix)
	}

	@RequestMapping("/addCandidate") // User Request End Service URL
	public String addCandidate(Map<String, Object> model, @RequestParam Map<String, String> requestParams) {
		String firstName = requestParams.get("firstname");
		String lastName = requestParams.get("lastname");
		Candidate candidate = new Candidate();
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		Integer count = candidateDao.addCandidate(candidate);
		if (count == 1) {
			model.put("message", "Profile is registered sucessfully");
		} else {
			model.put("message", "Profile is failed to registered.");
		}
		return "welcome";
	}

	@RequestMapping("/deleteCandidate")
	public String deleteCandidate(Map<String, Object> model, @RequestParam Map<String, String> requestParams) {
		String id = requestParams.get("id");
		Integer count = candidateDao.deleteCandidate(Integer.valueOf(id));
		if (count == 1) {
			model.put("message", "Profile is deleted sucessfully");
		} else {
			model.put("message", "Profile is failed to delete.");
		}
		return "welcome";
	}
}