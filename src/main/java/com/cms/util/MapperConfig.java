package com.cms.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MapperConfig {

    private static SqlSessionFactory factory;

    //static初始化就加载
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        try {
            //两行代码死的，mybatis第一步：获取SqlSessionFactory对象
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取SqlSessionFactory对象后，获得sqlSession实例
    //sqlSession包含了几乎所有sql语句
    public static SqlSession getSession() {
        return factory.openSession(true);
    }

    //关闭SqlSession
    public static void closeSession(SqlSession session) {
        if (session != null) {
            session.close();
        }
    }

    private MapperConfig() {

    }
}

