package com.ohgiraffers.practice;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.Template.getSqlSession;

public class Service {

    private Mapper empMapper;

    public List<EmployeeDTO> selectAllEmp() {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(Mapper.class);
        List<EmployeeDTO> empList = empMapper.selectAllEmp();
        sqlSession.close();
        return empList;
    }

    public EmployeeDTO selectEmpById(String id) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(Mapper.class);
        EmployeeDTO emp = empMapper.selectEmpById(id);
        sqlSession.close();
        return emp;
    }

    public EmployeeDTO selectEmpByName(String name) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(Mapper.class);
        EmployeeDTO emp = empMapper.selectEmpByName(name);
        sqlSession.close();
        return emp;
    }

    public boolean insertEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        empMapper = sqlSession.getMapper(Mapper.class);
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
        empMapper = sqlSession.getMapper(Mapper.class);
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
        empMapper = sqlSession.getMapper(Mapper.class);
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
        empMapper = sqlSession.getMapper(Mapper.class);
        int result = empMapper.deleteEmp(id);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }
}
