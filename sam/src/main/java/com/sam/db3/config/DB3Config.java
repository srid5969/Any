package com.sam.db3.config;


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
		entityManagerFactoryRef = "db3entityManagerFactory",
						transactionManagerRef = "stockTransactionManager",
						basePackages = "com.sam.db3.repository")
public class DB3Config {
	@Bean(name = "db3DataSource")
	@ConfigurationProperties(prefix = "db3.datasource")
	public DataSource db3DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "db3entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean db3entityManagerFactoryBean(
			EntityManagerFactoryBuilder builder,
			@Qualifier("db3DataSource") DataSource dataSource) {

		return builder.dataSource(dataSource).packages("com.sam.db3.entity").persistenceUnit("db3")
				.build();
	}

	@Bean(name = "stockTransactionManager")
	public PlatformTransactionManager stockTransactionManager(
			@Qualifier("db3entityManagerFactory") EntityManagerFactory db3entityManagerFactory) {
		return new JpaTransactionManager(db3entityManagerFactory);
	}
}
