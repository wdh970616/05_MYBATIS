package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do {
            System.out.println("\n=========== Mapper Element Test Menu ===========");
            System.out.println("1. <cache> 테스트");
            System.out.println("2. <resultMap> 서브메뉴");
            System.out.println("3. <sql> 테스트");
            System.out.println("4. <insert> 서브메뉴");
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
                    elementTestService.selectSqlTest();
                    break;
                case 4:
                    insertSubMenu();
                    break;
                case 0:
                    return;
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

    private static void insertSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do {
            System.out.println("\n=========== <insert> Sub Menu ===========");
            System.out.println("1. <insert> 테스트");
            System.out.println("2. <insert> 테스트 (신규 카테고리의 메뉴 등록)");
            System.out.println("0. 되돌아가기");
            System.out.print("원하시는 기능 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    elementTestService.insertMenuTest(inputMenu());
                    break;
                case 2:
                    elementTestService.insertCategoryAndMenuTest(inputMenuAndCategory());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\n!!! 잘못된 번호를 입력하셨습니다 !!!");
                    break;
            }
        } while (true);
    }

    private static MenuDTO inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 메뉴의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("등록할 메뉴의 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("등록할 메뉴의 카테고리 코드를 입력하세요 : ");
        int categoryCode = sc.nextInt();
        System.out.print("바로 판매등록을 하시겠습니까? (Y/N) : ");
        sc.nextLine();
        String orderableStatus = sc.nextLine();

        MenuDTO menu = new MenuDTO();
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);
        menu.setOrderableStatus(orderableStatus);

        return menu;
    }

    private static MenuAndCategoryDTO inputMenuAndCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.print("신규 카테고리명을 입력하세요 : ");
        String categoryName = sc.nextLine();
        System.out.print("등록할 메뉴의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("등록할 메뉴의 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("바로 판매등록을 하시겠습니까? (Y/N) : ");
        sc.nextLine();
        String orderableStatus = sc.nextLine();

        MenuAndCategoryDTO menuAndCategory = new MenuAndCategoryDTO();
        CategoryDTO category = new CategoryDTO();

        // 카테고리 세팅
        category.setName(categoryName);

        // MenuAndCategory 세팅
        menuAndCategory.setName(name);
        menuAndCategory.setPrice(price);
        menuAndCategory.setOrderableStatus(orderableStatus);
        menuAndCategory.setCategory(category);

        return menuAndCategory;
    }
}
