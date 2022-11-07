package com.sam.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sam.db1.service.CompanyService;

@RestController
@RequestMapping("/sp")
public class CompanyProcedureController {

	@Autowired(required = false)
	CompanyService companyService;

	
//	@GetMapping("/a/company/{id}/{company}")
//	public String updataCompanysNameusingCompanyId(@PathVariable int id, @PathVariable String company) {
//		companyService.updataCompanyNameusingCompanysId(id, company);
//		return "Successfully added company " + company;
//	}

	@PostMapping("/a/company/")
	public String a_updataCompanysNameusingCompanyId(@RequestParam(value = "id") int id,
			@RequestParam(value = "company") String company) throws Exception{
		companyService.updataCompanyNameusingCompanysId(id, company);
		return "Successfully added company " + company+"  in  id Value"+id;
	}
}
