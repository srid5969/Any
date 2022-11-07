package com.sam.db3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sam.db3.entity.Stock_Price;
import com.sam.db3.service.GetWeeklyFutureRangeService;
import com.sam.db3.service.Get_wdgWheelService;
import com.sam.db3.service.Stock_PriceService;

@RestController
@RequestMapping("/hello/wor")
public class StockPriceRestController {
	@Autowired
	private Stock_PriceService service;
	@Autowired
	private Get_wdgWheelService functionService;
	@Autowired
	private GetWeeklyFutureRangeService futureRangeService;

	
	@GetMapping("/view")
	public List<Object> get_weekly_future_range(){
		return futureRangeService.get_weekly_future_range();
	}
	
	
	@GetMapping("/select")
	public Stock_Price listAllStockPriceByUSingSelectQuery(@RequestParam(defaultValue = "197") int id) {
		return service.listAllStockPrices(id);
	}

	@GetMapping("/object")
	public List<Stock_Price> listAllStockPriceBySelectQuery() {
		return service.listAllStockPricesUsingObjectDatatype();
	}

	@GetMapping("/get")
	public List<Object> get_wdgwheel(@RequestParam(defaultValue = "1") int from,
			@RequestParam(defaultValue = "10") int to) {
		return functionService.get_wdgwheel(from, to);
	}
}
