package com.springstudy.firstdemo;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class FirstdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
    }
    
   /* public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
    	SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
    	sf.setDataSource(dataSource);
    	
    	Resource[] res = new PathMatchingResourcePatternResolver().getResources("src/main/resources/mapper/*.xml");
    	sf.setMapperLocations(res);
    	return sf.getObject();
    }*/
}
