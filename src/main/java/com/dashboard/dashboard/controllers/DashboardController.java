package com.dashboard.dashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dashboard.dashboard.services.EnterProjectDetailsService;

@Controller
public class DashboardController {

	private EnterProjectDetailsService enterProjectDetailsService;
	public DashboardController(EnterProjectDetailsService enterProjectDetailsService) {
		this.enterProjectDetailsService=enterProjectDetailsService;
	}
	
	@GetMapping("/dashboard")
	public String launchDashboard() {
		enterProjectDetailsService.saveInformation();
		return "public-dashboard";
	}
}
