package com.ohgiraffers.practice.emp;

import com.ohgiraffers.DTO.DeptAndEmpDTO;
import com.ohgiraffers.DTO.EmpAndDeptDTO;
import java.util.List;

public interface ElementTestMapper {

    EmpAndDeptDTO selectEmpById(int id);
    List<DeptAndEmpDTO> selectDept();
}
