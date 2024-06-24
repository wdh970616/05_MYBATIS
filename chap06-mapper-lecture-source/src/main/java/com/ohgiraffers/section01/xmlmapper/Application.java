package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do {
            System.out.println("\n=========== Mapper Element Test Menu ===========");
            System.out.println("1. <cache> 테스트");
            System.out.println("3. <resultMap> 서브메뉴");
            System.out.println("2. <sql> 테스트");
            System.out.println("3. <insert> 서브메뉴");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하시는 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    elementTestService.selectCacheTest();
                    break;
                case 2:
                    resultMapSubMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0 : return;
                default:
                    System.out.println("\n!!! 잘못된 번호를 입력하셨습니다 !!!");
                    break;
            }
        } while (true);
    }

    private static void resultMapSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do {
            System.out.println("\n=========== <ResultMap> Sub Menu ===========");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2.<constructor> 테스트");
            System.out.println("3.<association> 테스트");
            System.out.println("4.<collection> 테스트");
            System.out.println("0. 되돌아가기");
            System.out.print("원하시는 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    elementTestService.selectResultMapTest();
                    break;
                case 2:
                    elementTestService.selectResultMapConstructorTest();
                    break;
                case 3:
                    elementTestService.selectResultMapAssociationTest();
                    break;
                case 4:
                    elementTestService.selectResultMapCollectionTest();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\n!!! 잘못된 번호를 입력하셨습니다 !!!");
                    break;
            }
        } while (true);
    }
}
