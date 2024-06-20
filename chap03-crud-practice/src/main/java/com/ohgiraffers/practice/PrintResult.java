package com.ohgiraffers.practice;

import java.util.List;

public class PrintResult {

    public void printEmpList(List<EmployeeDTO> empList) {
        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }

    public void printEmp(EmployeeDTO emp) {
        System.out.println(emp);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage = "\n================================"
                        + "!!! 사원 목록 조회를 실패했습니다 !!!"
                        + "================================\n";
                break;
            case "selectOne":
                errorMessage = "\n============================"
                        + "!!! 사원 조회를 실패했습니다 !!!"
                        + "============================\n";
                break;
            case "insert":
                errorMessage = "\n================================"
                        + "!!! 신규 사원 등록을 실패했습니다 !!!"
                        + "================================\n";
                break;
            case "update":
                errorMessage = "\n================================"
                        + "!!! 사원 정보 수정을 실패했습니다 !!!"
                        + "================================\n";
                break;
            case "retire":
                errorMessage = "\n==========================="
                        + "!!! 퇴사처리를 실패했습니다 !!!"
                        + "===========================\n";
                break;
            case "delete":
                errorMessage = "\n================================"
                        + "!!! 사원 정보 삭제를 실패했습니다 !!!"
                        + "================================\n";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "\n========================="
                        + "신규 사원 등록을 성공했습니다."
                        + "=========================\n";
                break;
            case "update":
                successMessage = "\n========================="
                        + "사원 정보 수정을 성공했습니다."
                        + "=========================\n";
                break;
            case "retire":
                successMessage = "\n====================="
                        + "퇴사처리가 완료되었습니다."
                        + "=====================\n";
                break;
            case "delete":
                successMessage = "\n========================="
                        + "사원 정보 삭제를 성공했습니다."
                        + "=========================\n";
                break;
        }
        System.out.println(successMessage);
    }
}
