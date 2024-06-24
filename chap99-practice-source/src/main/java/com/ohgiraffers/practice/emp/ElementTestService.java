package com.ohgiraffers.practice.emp;

import com.ohgiraffers.DTO.DeptAndEmpDTO;
import com.ohgiraffers.DTO.EmpAndDeptDTO;
import com.ohgiraffers.DTO.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper empMapper;

    public void selectEmpById(int id) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(ElementTestMapper.class);

        EmpAndDeptDTO emp = empMapper.selectEmpById(id);

        System.out.println();
        System.out.println("[사원명 : " + emp.getName() + "] [부서명 : " + emp.getDept().getTitle() + ']');
        System.out.println(emp);

        sqlSession.close();
    }

    public void selectDept() {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(ElementTestMapper.class);

        System.out.print("조회하실 부서ID의 번호를 입력하세요 : D");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        List<DeptAndEmpDTO> deptList = empMapper.selectDept();
        List<EmployeeDTO> empList = deptList.get((index - 1)).getEmpList();

        System.out.println();
        if (empList.size() > 0) {
            for (EmployeeDTO emp : empList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("!!! 해당 부서에 속한 사원이 없습니다 !!!");
        }
        sqlSession.close();
    }
}
