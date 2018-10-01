package com.dashboard.dashboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="development_board")
public class DevelopmentBoard {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="developmentBoardId")
	private Long developmentBoardId;

	private String userId;
	private String projectName;
	private String tspName;
	private String lmName;
	private long expectedTotalDevelopment;
	private long actualTotalDevelopment;
	private String monthName;
	private String yearName;
	private String deliveryType;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTspName() {
		return tspName;
	}
	public void setTspName(String tspName) {
		this.tspName = tspName;
	}
	public String getLmName() {
		return lmName;
	}
	public void setLmName(String lmName) {
		this.lmName = lmName;
	}
	public long getExpectedTotalDevelopment() {
		return expectedTotalDevelopment;
	}
	public void setExpectedTotalDevelopment(long expectedTotalDevelopment) {
		this.expectedTotalDevelopment = expectedTotalDevelopment;
	}
	public long getActualTotalDevelopment() {
		return actualTotalDevelopment;
	}
	public void setActualTotalDevelopment(long actualTotalDevelopment) {
		this.actualTotalDevelopment = actualTotalDevelopment;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public String getYearName() {
		return yearName;
	}
	public void setYearName(String yearName) {
		this.yearName = yearName;
	}
	
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
}
