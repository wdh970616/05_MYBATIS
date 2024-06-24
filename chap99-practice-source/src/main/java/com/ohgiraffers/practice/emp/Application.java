
package com.ohgiraffers.practice.emp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do {
            System.out.println("\n============== employee 테스트 메뉴 ==============");

            // 1명의 사원과 부서명을 볼 수 있도록 출력
            // EmployeeAndDDeptDTO
            System.out.println("(1) association 테스트");
            // 각부서에 있는 직원 정보를 출력
            // DeptAndEmployeeDTO
            System.out.println("(2) collection 테스트");
            System.out.println("(0) 프로그램 종료");
            System.out.print("사용하실 메뉴의 번호를 입력하세요 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    elementTestService.selectEmpById(inputEmpId());
                    break;
                case 2:
                    elementTestService.selectDept();
                    break;
                default:
                    System.out.println("\n!!! 잘못 입력하셨습니다 !!!");
                    break;
                case 0:
                    return;
            }
        } while (true);
    }

    private static int inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 직원의 ID를 입력하세요 : ");
        int id = sc.nextInt();
        return id;
    }
}
