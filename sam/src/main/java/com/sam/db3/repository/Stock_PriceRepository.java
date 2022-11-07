package com.sam.db3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sam.db3.entity.Stock_Price;

@Repository
public interface Stock_PriceRepository extends JpaRepository<Stock_Price, Integer> {

	@Query(value = "SELECT * FROM stock_price where sid=:idValue", nativeQuery = true)
	Stock_Price listAllStockPrices(@Param(value = "idValue") int idValue);

//	@Query(value = "SELECT * from public.get_wdgwheel(:from, :to)", nativeQuery = true)
//	List<Object> get_wdgwheel(@Param("from") int from,@Param("to") int to);

	@Query(value = "SELECT * FROM stock_price", nativeQuery = true)
	List<Stock_Price> listAllStockPricesObjectDatatype();
}
