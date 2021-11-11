package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
    public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
}
