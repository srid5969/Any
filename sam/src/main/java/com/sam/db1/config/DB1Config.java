package com.sam.db1.config;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "db1entityManagerFactory",
						transactionManagerRef = "companyTransactionManager",
						basePackages = "com.sam.db1.repository")
public class DB1Config {
	@Primary
	@Bean(name = "db1DataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource db1DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "db1entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean db1entityManagerFactoryBean(
			EntityManagerFactoryBuilder builder,
			@Qualifier("db1DataSource") DataSource dataSource) {

		return builder.dataSource(dataSource).packages("com.sam.db1.entity").persistenceUnit("db1")
				.build();
	}

	@Primary
	@Bean(name = "companyTransactionManager")
	public PlatformTransactionManager companyTransactionManager(
			@Qualifier("db1entityManagerFactory") EntityManagerFactory db1entityManagerFactory) {
		return new JpaTransactionManager(db1entityManagerFactory);
	}
}
