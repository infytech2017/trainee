package com.infy.vivah;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.infy.vivah.domain.Candidate;
import com.infy.vivah.processor.PayrollExportProcessor;

@SpringBootApplication
@ComponentScan("com.infy.vivah.dao")
public class PayrollExportApplication {
	
	@Autowired
	 ApplicationContext context;

	public static void main(String[] args) {
		System.out.println("Starting - Spring Boot Application");
		SpringApplication.run(PayrollExportApplication.class, args);
		
		PayrollExportProcessor payrollExportProcessor = new PayrollExportProcessor();
		List<Candidate> candidates = payrollExportProcessor.getCandidate(1); // Read

		System.out.println("Started - Spring Boot Application");
	}
}