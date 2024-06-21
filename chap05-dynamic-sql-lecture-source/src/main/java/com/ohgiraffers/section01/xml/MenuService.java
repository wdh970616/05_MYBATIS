package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    private DynamicSqlMapper mapper;

    public void selectMenuByPrice(int price) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        // 동적쿼리를 사용시 조건문의 값을 비교해야할때 기본자료형으로는 비교가 불가함.
        // 따라서 hashmap의 key 혹은 dto의 getter를 이용해서 값을 비교함.
        Map<String, Integer> map = new HashMap<>();
        map.put("price", price);
        List<MenuDTO> menuList = mapper.selectMenuByPrice(map);

        System.out.println();
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<MenuDTO> menuList = mapper.searchMenu(searchCriteria);

        System.out.println();
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void searchMenuBySubCategory(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<MenuDTO> menuList = mapper.searchMenuBySubCategory(searchCriteria);

        System.out.println();
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 잘못된 입력이거나 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void searchMenuByRandomMenuCode(List<Integer> randomMenuCodeList) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Map<String, List<Integer>> criteria = new HashMap<>();
        criteria.put("randomMenuCodeList", randomMenuCodeList);
        List<MenuDTO> menuList = mapper.searchMenuByRandomCodeList(criteria);

        System.out.println();
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 잘못된 입력이거나 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<MenuDTO> menuList = mapper.searchMenuByCodeAllSearchAll(searchCriteria);

        System.out.println();
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 잘못된 입력이거나 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<MenuDTO> menuList = mapper.searchMenuByNameOrCategory(criteria);

        System.out.println();
        if(menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("!!! 검색 결과가 존재하지 않습니다 !!!");
        }
        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        int result = mapper.modifyMenu(criteria);

        if(result > 0) {
            System.out.println("\n메뉴 정보 변경에 성공하셨습니다.");
            sqlSession.commit();
        } else {
            System.out.println("\n메뉴 정보 변경에 실패하셨습니다.");
            sqlSession.rollback();
        }
        sqlSession.close();
    }
}
