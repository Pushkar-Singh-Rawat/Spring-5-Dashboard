package com.dashboard.dashboard.services;

import java.util.List;

import com.dashboard.dashboard.domain.DevelopmentBoard;

public interface EnterProjectDetailsService {

	public void saveInformation();
	public Iterable<DevelopmentBoard> getTotalExpectedDevelopmentCount();
	public List<DevelopmentBoard> getActualDevelopmentCount();
}
