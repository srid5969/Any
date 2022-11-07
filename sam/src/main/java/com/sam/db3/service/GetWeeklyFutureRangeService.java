package com.sam.db3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db3.repository.ViewRepository;

@Service
public class GetWeeklyFutureRangeService {
	@Autowired
	private ViewRepository repository;
	
	
	public List<Object> get_weekly_future_range(){
		return repository.get_weekly_future_range();
	}

}
