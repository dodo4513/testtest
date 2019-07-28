package com.kakaopay.assignment.config;

import java.util.HashMap;
import javax.sql.DataSource;
import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author doyoung hwang on 2019-07-28
 */

@Configuration
@EnableConfigurationProperties(FinanceConfig.class)
@EnableJpaRepositories(
    basePackages = "com.kakaopay.assignment.repo",
    entityManagerFactoryRef = "financeEntityManager",
    transactionManagerRef = "financeTransactionManager"
)
public class FinanceDatasource {

  private final FinanceConfig financeConfig;

  @Autowired
  public FinanceDatasource(FinanceConfig financeConfig) {
    this.financeConfig = financeConfig;
  }

  @Bean
  public DataSource masterDataSource() {
    SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
    dataSource.setUsername(financeConfig.getUsername());
    dataSource.setPassword(financeConfig.getPassword());
    dataSource.setUrl(financeConfig.getUrl());
    dataSource.setDriverClass(Driver.class);

    return dataSource;
  }


  @Primary
  @Bean
  public LocalContainerEntityManagerFactoryBean financeEntityManager() {
    LocalContainerEntityManagerFactoryBean dd = new LocalContainerEntityManagerFactoryBean();

    dd.setDataSource(masterDataSource());
    dd.setPackagesToScan("com.kakaopay.assignment.repo.model");

    dd.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

    HashMap<String, Object> aa = new HashMap<>();

//    aa.put("hibernate.hbm2ddl.auto", "true");
    aa.put("hibernate.temp.use_jdbc_metadata_defaults", false);
    aa.put("hibernate.jdbc.lob.non_contextual_creation", true);
    aa.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");

    dd.setJpaPropertyMap(aa);

    return dd;

  }

  @Primary
  @Bean
  public PlatformTransactionManager financeTransactionManager() {
    JpaTransactionManager jj = new JpaTransactionManager();
    jj.setEntityManagerFactory(financeEntityManager().getObject());
    return jj;
  }
}
