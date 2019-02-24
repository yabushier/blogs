package com.yabushier.blogs.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class MyBatisPageHelperConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 配置分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.put("dialect","mysql");// dialect：数据库方言，指定当前具体使用的数据库
        properties.put("reasonable","true");// 将前台页面传入的页码修正到1~总页数之间的范围
        pageHelper.setProperties(properties);
        // 向sqlSessionFactoryBean中添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();

    }

}
