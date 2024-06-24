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
            System.out.print("원하시는 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    elementTestService.selectCacheTest();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (true);
    }
}
