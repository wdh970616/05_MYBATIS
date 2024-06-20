package com.ohgiraffers.practice;

import java.util.List;

public interface Mapper {

    List<EmployeeDTO> selectAllEmp();

    EmployeeDTO selectEmpById(String id);

    EmployeeDTO selectEmpByName(String name);

    int insertEmp(EmployeeDTO emp);

    int updateEmp(EmployeeDTO emp);

    int retireEmp(EmployeeDTO emp);

    int deleteEmp(String id);

}
