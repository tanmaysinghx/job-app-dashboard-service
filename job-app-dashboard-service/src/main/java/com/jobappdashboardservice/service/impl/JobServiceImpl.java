package com.jobappdashboardservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jobappdashboardservice.model.Job;
import com.jobappdashboardservice.repository.JobRepository;
import com.jobappdashboardservice.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobRepository jobRepository;

	@Override
	public Job createJob(Job job) throws Exception {
		Job local;
		local = this.jobRepository.save(job);
		return local;
	}

	@Override
	public List<Job> getAllJobs(String token) throws Exception {
		callRestApi(token);
		return jobRepository.findAll();
	}

	// function to call api to verify jwt token
	public void callRestApi(String token) {
		String apiUrl = "http://localhost:8080/current-user";
		// Make a GET request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", token);
		// Create a HttpEntity with headers
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		// Make a GET request with the HttpEntity containing headers
		ResponseEntity<String> responseEntity = new RestTemplate().exchange(apiUrl, HttpMethod.GET, requestEntity,
				String.class);
		String responseBody = responseEntity.getBody();
		System.out.println("Response: " + responseBody);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(responseBody);

			if (jsonNode.has("authorities")) {
				JsonNode authoritiesNode = jsonNode.get("authorities");
				if (authoritiesNode.isArray() && authoritiesNode.size() > 0) {
					String authority = authoritiesNode.get(0).get("authority").asText();
					System.out.println("Authority: " + authority);
				}
			}
		} catch (Exception e) {
			// Handle JSON parsing exceptions
			e.printStackTrace();
		}
	}

}
