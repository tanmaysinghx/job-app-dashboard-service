package com.jobappdashboardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobappdashboardservice.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
	
}
