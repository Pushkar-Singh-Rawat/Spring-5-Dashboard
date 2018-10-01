package com.dashboard.dashboard.databootstrap;

import java.util.Iterator;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.dashboard.dashboard.domain.DevelopmentBoard;
import com.dashboard.dashboard.repositories.DashboardDevRepository;

@Component
@Profile({"dev"})
public class MySqlDataBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private DashboardDevRepository dashboardDevRepository;
	public MySqlDataBootstrap(DashboardDevRepository dashboardDevRepository) {
		this.dashboardDevRepository=dashboardDevRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(dashboardDevRepository.count()==0L) {
			loadDashboardDev();
		}
		
	}
	private void loadDashboardDev() {
		
		DevelopmentBoard devBoard=new DevelopmentBoard();
		devBoard.setExpectedTotalDevelopment(1400);
		devBoard.setActualTotalDevelopment(1100);
	    dashboardDevRepository.save(devBoard);
	    Iterator<DevelopmentBoard> it=dashboardDevRepository.findAll().iterator();
	    while(it.hasNext()) {
	    	System.out.println("++++++++++++++++"+it.next().getActualTotalDevelopment());
	    }
	}
	

}
