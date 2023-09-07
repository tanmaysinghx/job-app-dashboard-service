package com.jobappdashboardservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobappdashboardservice.model.Job;

@Service
public interface JobService {
	//create job openings 
	 public Job createJob(Job job) throws Exception;
	 
	//get all jobs
	public List<Job> getAllJobs(String token) throws Exception;

	 
}
