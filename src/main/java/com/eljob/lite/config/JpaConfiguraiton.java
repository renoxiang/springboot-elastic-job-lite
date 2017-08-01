/**
 * Copyright  2016  Pemass
 * All Right Reserved.
 */
package com.eljob.lite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Description: JPA配置1
 * @Author: cassiel.liu
 * @CreateTime: 2017-04-15 15:55
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories
public class JpaConfiguraiton {

    @Resource
    private DataSource dataSource;

    /**
     * 实体管理器
     *
     * @return
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);
        vendorAdapter.setShowSql(true);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");
        entityManagerFactory.setJpaVendorAdapter(vendorAdapter);

        entityManagerFactory.setPersistenceXmlLocation("classpath*:persistence.xml");

        return entityManagerFactory;
    }

}
