package com.sam.db1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db1.entity.Company;
import com.sam.db1.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired(required = false)
	CompanyRepository companyRepository;

	public void updataCompanyNameusingCompanysId(int id, String company) {
		 companyRepository.updataCompanyNameusingCompanyId(id, company);
	}

	public List<Company> getAllCompany() {
		List<Company> company = new ArrayList<Company>();
		companyRepository.findAll().forEach(company1 -> company.add(company1));
		return company;
	}

	public Company getCompanyById(int id) {
		return companyRepository.findById(id).get();
	}

	public void saveOrUpdate(Company company) {
		companyRepository.save(company);
	}

	public void delete(int id) {
		companyRepository.deleteById(id);
	}

	public void update(Company company, int companyid) {
		companyRepository.save(company);
	}

}