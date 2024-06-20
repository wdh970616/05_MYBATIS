package com.ohgiraffers.practice;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Controller {

    private final PrintResult printResult;
    private final Service service;

    public Controller() {
        printResult = new PrintResult();
        service = new Service();
    }

    public void sellectAllEmp() {
        List<EmployeeDTO> empList = service.selectAllEmp();
        if (empList != null) {
            System.out.println();
            printResult.printEmpList(empList);
            System.out.println();
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void sellectEmpByID(Map<String, String> parameter) {
        String id = parameter.get("id");
        EmployeeDTO emp = service.selectEmpById(id);
        if (emp != null) {
            System.out.println();
            printResult.printEmp(emp);
            System.out.println();
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void sellectEmpByName(Map<String, String> parameter) {
        String name = parameter.get("name");
        EmployeeDTO emp = service.selectEmpByName(name);
        if (emp != null) {
            System.out.println();
            printResult.printEmp(emp);
            System.out.println();
        } else {
            printResult.printErrorMessage("selectOne");
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

        if (service.insertEmp(emp)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
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

        if (service.updateEmp(emp)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
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

        if (service.retireEmp(emp)) {
            printResult.printSuccessMessage("retire");
        } else {
            printResult.printErrorMessage("retire");
        }
    }

    public void deleteEmp(Map<String, String> parameter) {
        String id = parameter.get("id");

        if (service.deleteEmp(id)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
