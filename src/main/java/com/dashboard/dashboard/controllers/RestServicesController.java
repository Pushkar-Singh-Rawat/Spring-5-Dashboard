package com.dashboard.dashboard.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.dashboard.domain.DevelopmentBoard;
import com.dashboard.dashboard.services.EnterProjectDetailsService;

@RestController
public class RestServicesController {

	private EnterProjectDetailsService enterProjectDetailsService;
	public RestServicesController(EnterProjectDetailsService enterProjectDetailsService) {
		this.enterProjectDetailsService=enterProjectDetailsService;
	}
	

    
	@GetMapping("/dashboard/getDevelopmentAnalysis")
	public List<DevelopmentBoard> getAnalysis(){
		Iterable it=enterProjectDetailsService.getTotalExpectedDevelopmentCount();
		Iterator<DevelopmentBoard> detailsList=it.iterator();
		List<DevelopmentBoard> projectDetails=new ArrayList<DevelopmentBoard>();
		while(detailsList.hasNext()) {
			projectDetails.add(detailsList.next());
		}
		return projectDetails;
	}
	
	@GetMapping("/dashboard/getProjectsWithDevelopmentStarted")
	public List<DevelopmentBoard> getActualDevelopmentCount(){
		System.out.println("projects having development started "+enterProjectDetailsService.getActualDevelopmentCount().size());
		return enterProjectDetailsService.getActualDevelopmentCount();
	}
	

}
