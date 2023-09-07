package com.jobappdashboardservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobPostings")
public class Job {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long jobId;
	private String category;
	private String title;
	private Long experience;
	private Long adminId;
	private String adminUsername;
	private String salaryRange;
	private String description;
	private String status;
	private String skills;
	private String companyName;
	private String location;
	private String jobType;
	private String detailedDescription;
	
	public Job(Long jobId, String category, String title, Long experience, Long adminId, String adminUsername,
			String salaryRange, String description, String status, boolean enabled, String skills, String companyName, String location, String jobType, String detailedDescription) {
		super();
		this.jobId = jobId;
		this.category = category;
		this.title = title;
		this.experience = experience;
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.salaryRange = salaryRange;
		this.description = description;
		this.status = status;
		this.enabled = enabled;
		this.skills = skills;
		this.companyName = companyName;
		this.location = location;
		this.jobType = jobType;
		this.detailedDescription = detailedDescription;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	private boolean enabled;
	
	public Job() {}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getExperience() {
		return experience;
	}

	public void setExperience(Long experience) {
		this.experience = experience;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}


