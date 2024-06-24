package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectCacheTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        for (int i = 0; i < 10; i++) {
            // 조회시간 확인용 시작시간
            Long startTime = System.currentTimeMillis();

            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            // 조회시간 확인용 종료시간
            Long endTime = System.currentTimeMillis();

            // 총 소요시간 출력
            long interval = endTime - startTime;
            System.out.println("수행시간 :  " + interval + "(ms)");
        }
        sqlSession.close();
    }

    public void selectResultMapTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        System.out.println();
        List<MenuDTO> menuList = mapper.selectResultMapTest();
        for (MenuDTO menu : menuList) {
            System.out.println(menu);
        }
        sqlSession.close();
    }

    public void selectResultMapConstructorTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        System.out.println();
        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();
        for (MenuDTO menu : menuList) {
            System.out.println(menu);
        }
        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        System.out.println();
        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();
        for (MenuAndCategoryDTO menu : menuList) {
            System.out.println(menu);
        }
        sqlSession.close();
    }
}
