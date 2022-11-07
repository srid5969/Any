package com.sam.db3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db3.entity.Stock_Price;
import com.sam.db3.repository.Stock_PriceRepository;

@Service
public class Stock_PriceService {
	@Autowired(required = false)
	private Stock_PriceRepository stock_PriceRepository;
	
	public Stock_Price listAllStockPrices(int id){
		return stock_PriceRepository.listAllStockPrices(id);
	}
	public List<Stock_Price> listAllStockPricesUsingObjectDatatype(){
		return stock_PriceRepository.listAllStockPricesObjectDatatype();
	}
//	public List<Object> get_wdgwheel(int from ,int to){
//		return stock_PriceRepository.get_wdgwheel(from,to);
//	}
}