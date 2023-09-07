package com.jobappdashboardservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class JobAppDashboardServiceApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JobAppDashboardServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("starting code");

			//			Job job = new Job();
			//
			//			job.setCategory("TECH");
			//			job.setTitle("Angular Developer");
			//			job.setExperience(2L);
			//			job.setAdminId(1L);
			//			job.setAdminUsername(null);
			//			job.setSalaryRange(null);
			//			job.setDescription("Dummy desciption for now, will create a better description next time");
			//			job.setStatus("ACTIVE");
			//
			//			Job job1 = this.jobService.createJob(job);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
