package com.dashboard.dashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dashboard.dashboard.domain.DevelopmentBoard;

public interface DashboardDevRepository extends CrudRepository<DevelopmentBoard, Long> {

	@Query(value="Select * from Development_Board where actual_total_development>=1",
			nativeQuery=true)
	public List<DevelopmentBoard> findByDevelopmentBoardId();
}
