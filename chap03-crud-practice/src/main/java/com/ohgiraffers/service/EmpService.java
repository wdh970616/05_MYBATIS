package com.ohgiraffers.service;

import com.ohgiraffers.dao.EmpMapper;
import com.ohgiraffers.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmpService {

    private EmpMapper empMapper;

    public List<EmployeeDTO> selectAllEmp() {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        List<EmployeeDTO> empList = empMapper.selectAllEmp();
        sqlSession.close();
        return empList;
    }

    public EmployeeDTO selectEmpById(String id) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        EmployeeDTO emp = empMapper.selectEmpById(id);
        sqlSession.close();
        return emp;
    }

    public EmployeeDTO selectEmpByName(String name) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        EmployeeDTO emp = empMapper.selectEmpByName(name);
        sqlSession.close();
        return emp;
    }

    public boolean insertEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        int result = empMapper.insertEmp(emp);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean updateEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        int result = empMapper.updateEmp(emp);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean retireEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        int result = empMapper.retireEmp(emp);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean deleteEmp(String id) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        int result = empMapper.deleteEmp(id);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean setBonus(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
        int result = empMapper.setBonus(emp);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }
}
