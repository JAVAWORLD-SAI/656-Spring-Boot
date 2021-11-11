package com.example.dao;

import java.util.List;

import com.example.bo.EmployeeBO;

public interface IEmployeeDAO {
    public  List<EmployeeBO>  getEmpsByDesg(String cond)throws Exception;
}
