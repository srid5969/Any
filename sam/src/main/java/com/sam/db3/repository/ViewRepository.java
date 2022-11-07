package com.sam.db3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sam.db3.entity.Stock_Price;

public interface ViewRepository  extends JpaRepository<Stock_Price, Integer>{

	
	@Query(value = "SELECT * FROM public.get_weekly_future_range",nativeQuery = true)
	List<Object> get_weekly_future_range();
}
