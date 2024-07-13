package com.example.companycompass.service;

import com.example.companycompass.model.Company;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);

    Company getCompanyById(Long companyId);

    List<Company> getCompanies();

    Company updateCompany(Company company);

    void deleteCompanyById(Long companyId);
}
