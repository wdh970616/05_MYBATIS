package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {
    /*
     * Service란?
     *
     * 비즈니스 로직을 수행하는 클래스라고도함.
     * 주로 DAO가 DB에서 받아온 데이터를 전달받아 가공해 Controller로 return 해준다.
     *
     * MYBATIS에서 Service의 역할
     * 1. SqlSession 생성
     * 2. DAO(데이터베이스 접근 객체)의 메소드 호출
     * 3. 트랙젝션(commit, rollback) 제어
     */

    private final MenuDAO menuDAO;

    // 생성자 주입
    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {
        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        // MenuDAO를 이용하여 데이터베이스에서 menuList 가져오기
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        // 세션 닫아주기
        sqlSession.close();

        return menuList;
    }

    public MenuDTO selectMenuByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        MenuDTO menu = menuDAO.selectMenuByCode(sqlSession, code);
        sqlSession.close();
        return menu;
    }
}
