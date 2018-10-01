package com.dashboard.dashboard.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dashboard.dashboard.domain.DevelopmentBoard;
import com.dashboard.dashboard.repositories.DashboardDevRepository;

@Service
public class EnterProjectDetailsServiceImpl implements EnterProjectDetailsService{

	private DashboardDevRepository dashboardDevRepository;
	public EnterProjectDetailsServiceImpl(DashboardDevRepository dashboardDevRepository) {
		this.dashboardDevRepository=dashboardDevRepository;
	}
	@Override
	public void saveInformation() {
		
		DevelopmentBoard devBoard=new DevelopmentBoard();
		devBoard.setExpectedTotalDevelopment(1400);
		devBoard.setActualTotalDevelopment(1100);
	    dashboardDevRepository.save(devBoard);
	    Iterator<DevelopmentBoard> it=dashboardDevRepository.findAll().iterator();
	    while(it.hasNext()) {
	    	System.out.println("++++++++++++++++"+it.next().getActualTotalDevelopment());
	    }
	}
	@Override
	public Iterable<DevelopmentBoard> getTotalExpectedDevelopmentCount() {
		// TODO Auto-generated method stub
		return dashboardDevRepository.findAll();
		
	}
	
	public List<DevelopmentBoard> getActualDevelopmentCount() {
		return dashboardDevRepository.findByDevelopmentBoardId();
	}

}
