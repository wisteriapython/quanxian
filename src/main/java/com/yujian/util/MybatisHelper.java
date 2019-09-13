package com.yujian.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class MybatisHelper {

    private static Logger log=Logger.getLogger("com.yujian.util.MyBatisHelper");

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory(){
        if(null==sqlSessionFactory) {
            try {
               log.debug("加载配置文件mybatis-config.xml");
                InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                log.debug("创建sqlsessionfactory成功");
            } catch (IOException e) {
                e.printStackTrace();
                log.error("创建sqlSessionFactory出错"+e);
            }
        }
        return sqlSessionFactory;
    }
}
