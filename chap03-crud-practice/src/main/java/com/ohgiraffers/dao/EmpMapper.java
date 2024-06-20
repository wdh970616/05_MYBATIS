package com.ohgiraffers.dao;

import com.ohgiraffers.dto.EmployeeDTO;

import java.util.List;

public interface EmpMapper {

    List<EmployeeDTO> selectAllEmp();
    EmployeeDTO selectEmpById(String id);
    EmployeeDTO selectEmpByName(String name);
    int insertEmp(EmployeeDTO emp);
    int updateEmp(EmployeeDTO emp);
    int retireEmp(EmployeeDTO emp);
    int deleteEmp(String id);
    int setBonus(EmployeeDTO emp);
}
