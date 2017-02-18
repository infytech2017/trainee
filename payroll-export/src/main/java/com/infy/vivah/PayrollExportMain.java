package com.infy.vivah;

import java.util.List;

import com.infy.vivah.domain.Candidate;
import com.infy.vivah.processor.PayrollExportProcessor;

public class PayrollExportMain {

	public static void main(String[] args) {
		System.out.println("Starting - Main  Application");
		PayrollExportProcessor payrollExportProcessor = new PayrollExportProcessor();
		 List<Candidate> candidates=payrollExportProcessor.getCandidate(1);
		System.out.println("Started - Main Application");
	}
}