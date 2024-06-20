package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmpController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpController empController = new EmpController();
        do {
            System.out.println("=== 오지라퍼 사원 관리 시스템 ===");
            System.out.println("1. 사원 전체 조회하기");
            System.out.println("2. 사원 ID로 조회하기");
            System.out.println("3. 사원명으로 조회하기");
            System.out.println("4. 신규 사원 등록하기");
            System.out.println("5. 사원 정보 수정하기");
            System.out.println("6. 퇴사처리 하기");
            System.out.println("7. 사원 정보 삭제하기");
            System.out.println("8. 보너스율 설정하기");
            System.out.print("사용하실 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    empController.sellectAllEmp();
                    break;
                case 2:
                    empController.sellectEmpByID(inputEmpId());
                    break;
                case 3:
                    empController.sellectEmpByName(inputEmpName());
                    break;
                case 4:
                    empController.insertEmp(inputEmp());
                    break;
                case 5:
                    empController.updateEmp(inputUpdateEmp());
                    break;
                case 6:
                    empController.retireEmp(inputRetireEmp());
                    break;
                case 7:
                    empController.deleteEmp(inputEmpId());
                    break;
                case 8:
                    empController.setBonus(inputSetBonus());
                    break;
                default:
                    System.out.println("\n========================");
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    System.out.println("========================\n");
                    break;
            }
        } while (true);
    }

    private static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사원ID를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputEmpName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사원명을 입력하세요 : ");
        String name = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);

        return parameter;
    }

    private static Map<String, String> inputEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.print("등록하실 사원의 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("등록하실 사원의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("등록하실 사원의 주민등록번호 앞 6자리를 입력해주세요 : ");
        String empProntNo = sc.nextLine();
        System.out.print("등록하실 사원의 주민등록번호 뒤 7자리를 입력해주세요 : ");
        String empBackNo = sc.nextLine();
        String no = empProntNo + "-" + empBackNo;
        System.out.print("등록하실 사원의 이메일 주소를 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("등록하실 사원의 전화번호를 '-'없이 번호만 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("등록하실 사원의 부서코드를 입력해주세요 : D");
        String deptNo = sc.nextLine();
        String deptCode = "D" + deptNo;
        System.out.print("등록하실 사원의 직급코드를 입력해주세요 : J");
        String jobNo = sc.nextLine();
        String jobCode = "J" + jobNo;
        System.out.print("등록하실 사원의 급여등급을 입력해주세요 : S");
        String salNo = sc.nextLine();
        String salLevel = "S" + salNo;
        System.out.print("등록하실 사원의 급여를 입력해주세요 : ");
        String salary = sc.nextLine();
        System.out.print("등록하실 사원의 관리자사번을 입력해주세요 : ");
        String managerId = sc.nextLine();
        System.out.print("등록하실 사원의 입사연도를 입력해주세요 : ");
        String year = sc.nextLine();
        System.out.print("등록하실 사원의 입사월을 입력해주세요 : ");
        String month = sc.nextLine();
        System.out.print("등록하실 사원의 입사일을 입력해주세요 : ");
        String day = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("managerId", managerId);
        parameter.put("year", year);
        parameter.put("month", month);
        parameter.put("day", day);

        return parameter;
    }

    private static Map<String, String> inputUpdateEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정보를 변경하실 사원의 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("새로 등록하실 사원의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("새로 등록하실 사원의 주민등록번호 앞 6자리를 입력해주세요 : ");
        String empProntNo = sc.nextLine();
        System.out.print("새로 등록하실 사원의 주민등록번호 뒤 7자리를 입력해주세요 : ");
        String empBackNo = sc.nextLine();
        String no = empProntNo + "-" + empBackNo;
        System.out.print("새로 등록하실 사원의 이메일 주소를 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("새로 등록하실 사원의 전화번호를 '-'없이 번호만 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("새로 등록하실 사원의 부서코드를 입력해주세요 : D");
        String deptNo = sc.nextLine();
        String deptCode = "D" + deptNo;
        System.out.print("새로 등록하실 사원의 직급코드를 입력해주세요 : J");
        String jobNo = sc.nextLine();
        String jobCode = "J" + jobNo;
        System.out.print("새로 등록하실 사원의 급여등급을 입력해주세요 : S");
        String salNo = sc.nextLine();
        String salLevel = "S" + salNo;
        System.out.print("새로 등록하실 사원의 급여를 입력해주세요 : ");
        String salary = sc.nextLine();
        System.out.print("새로 등록하실 사원의 관리자사번을 입력해주세요 : ");
        String managerId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("managerId", managerId);

        return parameter;
    }

    private static Map<String, String> inputRetireEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("퇴사처리 할 사원의 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("퇴사처리 할 사원의 퇴사연도를 입력해주세요 : ");
        String year = sc.nextLine();
        System.out.print("퇴사처리 할 사원의 퇴사월을 입력해주세요 : ");
        String month = sc.nextLine();
        System.out.print("퇴사처리 할 사원의 입사 퇴사일을 입력해주세요 : ");
        String day = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("year", year);
        parameter.put("month", month);
        parameter.put("day", day);

        return parameter;
    }

    private static Map<String, String> inputSetBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("설정할 사원의 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("설정할 보너스율을 입력해주세요 : ");
        String bonus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("bonus", bonus);

        return parameter;
    }
}
