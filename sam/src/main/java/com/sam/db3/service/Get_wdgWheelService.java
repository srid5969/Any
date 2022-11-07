package com.sam.db3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db3.repository.Get_wdgWheelRepository;

@Service
public class Get_wdgWheelService {
	
	@Autowired(required = false)
	private Get_wdgWheelRepository get_wdgWheel;
	
	
	public List<Object> get_wdgwheel(int from ,int to){
		return get_wdgWheel.get_wdgwheel(from,to);
	}

}
