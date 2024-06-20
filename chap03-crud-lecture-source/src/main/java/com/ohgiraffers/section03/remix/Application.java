package com.ohgiraffers.section03.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();
        do {
            System.out.println("=== 오지라퍼 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 메뉴 선택 조회하기");
            System.out.println("3. 메뉴 등록하기");
            System.out.println("4. 메뉴 수정하기");
            System.out.println("5. 메뉴 삭제하기");
            System.out.print("사용하실 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    menuController.selectAllmenu();
                    System.out.println();
                    break;
                case 2:
                    menuController.selectMenuByCode(inputMenuCode());
                    System.out.println();
                    break;
                case 3:
                    menuController.registMenu(inputMenu());
                    System.out.println();
                    break;
                case 4:
                    menuController.modifyMenu(inputModifyMenu());
                    System.out.println();
                    break;
                case 5:
                    menuController.deleteMenu(inputMenuCode());
                    System.out.println();
                    break;
                default:
                    System.out.println("\n========================");
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    System.out.println("========================\n");
                    break;
            }
        } while (true);
    }

    // 메뉴코드를 입력받는 메소드
    private static Map<String, String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    // 메뉴를 입력하는 메소드
    private static Map<String, String> inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> inputModifyMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("새로 등록할 메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("새로 등록할 메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("새로 등록할 카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }
}
