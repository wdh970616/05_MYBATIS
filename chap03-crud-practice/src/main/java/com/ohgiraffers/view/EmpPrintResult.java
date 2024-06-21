package com.ohgiraffers.view;

import com.ohgiraffers.dto.EmployeeDTO;

import java.util.List;

public class EmpPrintResult {

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
                errorMessage = "\n================================\n"
                        + "!!! 사원 목록 조회를 실패했습니다 !!!"
                        + "\n================================\n";
                break;
            case "selectEmpByDeptCode":
                errorMessage = "\n================================================\n"
                        + "!!! 없는 부서이거나 해당 부서에 속한 사원이 없습니다 !!!"
                        + "\n================================================\n";
                break;
            case "selectOne":
                errorMessage = "\n============================\n"
                        + "!!! 사원 조회를 실패했습니다 !!!"
                        + "\n============================\n";
                break;
            case "insert":
                errorMessage = "\n================================\n"
                        + "!!! 신규 사원 등록을 실패했습니다 !!!"
                        + "\n================================\n";
                break;
            case "update":
                errorMessage = "\n================================\n"
                        + "!!! 사원 정보 수정을 실패했습니다 !!!"
                        + "\n================================\n";
                break;
            case "retire":
                errorMessage = "\n===========================\n"
                        + "!!! 퇴사처리를 실패했습니다 !!!"
                        + "\n===========================\n";
                break;
            case "delete":
                errorMessage = "\n================================\n"
                        + "!!! 사원 정보 삭제를 실패했습니다 !!!"
                        + "\n================================\n";
                break;
            case "bonus":
                errorMessage = "\n===============================\n"
                        + "!!! 보너스율 설정에 실패했습니다 !!!"
                        + "\n===============================\n";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "\n=========================\n"
                        + "신규 사원 등록을 성공했습니다."
                        + "\n=========================\n";
                break;
            case "update":
                successMessage = "\n=========================\n"
                        + "사원 정보 수정을 성공했습니다."
                        + "\n=========================\n";
                break;
            case "retire":
                successMessage = "\n=====================\n"
                        + "퇴사처리가 완료되었습니다."
                        + "\n=====================\n";
                break;
            case "delete":
                successMessage = "\n=========================\n"
                        + "사원 정보 삭제를 성공했습니다."
                        + "\n=========================\n";
                break;
            case "bonus":
                successMessage = "\n==========================\n"
                        + "보너스율 설정이 완료되었습니다."
                        + "\n==========================\n";
        }
        System.out.println(successMessage);
    }
}
