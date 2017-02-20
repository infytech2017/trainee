package com.infy.vivah;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.vivah.domain.Candidate;
import com.infy.vivah.processor.PayrollExportProcessor;

public class PayrollExportMain {

	public static void main(String[] args) {
		System.out.println("Starting - Main  Application");
		ApplicationContext context = new ClassPathXmlApplicationContext("payroll_application.xml");

		PayrollExportProcessor payrollExportProcessor = context.getBean(PayrollExportProcessor.class);
		List<Candidate> candidates = payrollExportProcessor.getCandidate(2);
		System.out.println("Started - Main Application");
		
		if(!candidates.isEmpty()){
			System.out.println("Started - Main Application"+candidates.toString());
		}
	}
}