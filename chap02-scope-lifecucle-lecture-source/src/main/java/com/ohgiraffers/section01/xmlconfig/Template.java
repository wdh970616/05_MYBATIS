package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    /*
     * SqlSessionFactory는 어플리케이션을 실행하는 동안 항상 존재해야하며 실행중 여러 차례 다시 빌드하지 않는것이 좋은 형태이다.
     * 따라서, 어플리케이션 스코프를 관리하기 위한 가장 간단한 방법인 싱글톤 패턴을 사용해서 관리한다.
     */

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        /*
         * SqlSessionFactoryBuilder는 SqlSession을 생성한 후에 유지할 필요가 없다.
         * 따라서, 메소드 스토프로 만든다.
         */

        if (sqlSessionFactory == null) {
            String resource = "mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sqlSessionFactory.openSession(false);
    }
}
