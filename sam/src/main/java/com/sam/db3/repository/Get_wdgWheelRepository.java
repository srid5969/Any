package com.sam.db3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sam.db3.entity.Stock_Price;

public interface Get_wdgWheelRepository extends JpaRepository<Stock_Price, Integer> {

	@Query(value = "SELECT * from public.get_wdgwheel(:from, :to)", nativeQuery = true)
	List<Object> get_wdgwheel(@Param("from") int from, @Param("to") int to);
}
