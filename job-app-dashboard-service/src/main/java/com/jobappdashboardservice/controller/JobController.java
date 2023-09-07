package com.jobappdashboardservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jobappdashboardservice.model.Job;
import com.jobappdashboardservice.service.JobService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/job")
@CrossOrigin("*")
public class JobController {

	@Autowired
	private JobService jobService;

	@PostMapping("/create-job")
	public Job createJob(@RequestBody Job job) throws Exception {
		return this.jobService.createJob(job);
	}

	@GetMapping("/get-all-jobs")
	public List<Job> getAllJobs(@RequestHeader(name = "Authorization", required = false) String authorization) throws Exception {
		if (authorization != null) {
            System.out.println("Authorization Token: " + authorization);
        } else {
        	System.out.println("Authorization Token not found");
        }
		return this.jobService.getAllJobs(authorization);
	}
}
