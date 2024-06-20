package com.ohgiraffers.controller;

import com.ohgiraffers.dto.EmployeeDTO;
import com.ohgiraffers.view.EmpPrintResult;
import com.ohgiraffers.service.EmpService;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class EmpController {

    private final EmpPrintResult empPrintResult;
    private final EmpService empService;

    public EmpController() {
        empPrintResult = new EmpPrintResult();
        empService = new EmpService();
    }

    public void sellectAllEmp() {
        List<EmployeeDTO> empList = empService.selectAllEmp();
        if (empList != null) {
            System.out.println();
            empPrintResult.printEmpList(empList);
            System.out.println();
        } else {
            empPrintResult.printErrorMessage("selectList");
        }
    }

    public void sellectEmpByID(Map<String, String> parameter) {
        String id = parameter.get("id");
        EmployeeDTO emp = empService.selectEmpById(id);
        if (emp != null) {
            System.out.println();
            empPrintResult.printEmp(emp);
            System.out.println();
        } else {
            empPrintResult.printErrorMessage("selectOne");
        }
    }

    public void sellectEmpByName(Map<String, String> parameter) {
        String name = parameter.get("name");
        EmployeeDTO emp = empService.selectEmpByName(name);
        if (emp != null) {
            System.out.println();
            empPrintResult.printEmp(emp);
            System.out.println();
        } else {
            empPrintResult.printErrorMessage("selectOne");
        }
    }

    public void insertEmp(Map<String, String> parameter) {
        String id = parameter.get("id");
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));
        String managerId = parameter.get("managerId");
        int year = Integer.parseInt(parameter.get("year"));
        int month = Integer.parseInt(parameter.get("month"));
        int day = Integer.parseInt(parameter.get("day"));
        LocalDate javaDate = LocalDate.of(year, month, day);
        Date hireDate = Date.valueOf(javaDate);

        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(id);
        emp.setName(name);
        emp.setNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setManagerId(managerId);
        emp.setHireDate(hireDate);

        if (empService.insertEmp(emp)) {
            empPrintResult.printSuccessMessage("insert");
        } else {
            empPrintResult.printErrorMessage("insert");
        }
    }

    public void updateEmp(Map<String, String> parameter) {
        String id = parameter.get("id");
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));
        String managerId = parameter.get("managerId");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(id);
        emp.setName(name);
        emp.setNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setManagerId(managerId);

        if (empService.updateEmp(emp)) {
            empPrintResult.printSuccessMessage("update");
        } else {
            empPrintResult.printErrorMessage("update");
        }
    }

    public void retireEmp(Map<String, String> parameter) {
        String id = parameter.get("id");
        int year = Integer.parseInt(parameter.get("year"));
        int month = Integer.parseInt(parameter.get("month"));
        int day = Integer.parseInt(parameter.get("day"));
        LocalDate javaDate = LocalDate.of(year, month, day);
        Date entDate = Date.valueOf(javaDate);

        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(id);
        emp.setEntDate(entDate);

        if (empService.retireEmp(emp)) {
            empPrintResult.printSuccessMessage("retire");
        } else {
            empPrintResult.printErrorMessage("retire");
        }
    }

    public void deleteEmp(Map<String, String> parameter) {
        String id = parameter.get("id");

        if (empService.deleteEmp(id)) {
            empPrintResult.printSuccessMessage("delete");
        } else {
            empPrintResult.printErrorMessage("delete");
        }
    }

    public void setBonus(Map<String, String> parameter) {
        String id = parameter.get("id");
        double bonus = Double.parseDouble(parameter.get("bonus"));

        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(id);
        emp.setBonus(bonus);

        if (empService.setBonus(emp)) {
            empPrintResult.printSuccessMessage("bonus");
        } else {
            empPrintResult.printErrorMessage("bonus");
        }
    }
}
