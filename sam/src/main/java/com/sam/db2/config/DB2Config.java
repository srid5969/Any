package com.sam.db2.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "db2entityManagerFactory",
						transactionManagerRef = "db2TransactionManager", 
						basePackages = "com.sam.db2.repository")
public class DB2Config {
	@Bean(name = "db2DataSource")
	@ConfigurationProperties(prefix = "db2.datasource")
	public DataSource db2DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "db2entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(
			EntityManagerFactoryBuilder builder,
			@Qualifier("db2DataSource") DataSource dataSource) {

		return builder.dataSource(dataSource)
				.packages("com.sam.db2.entity")
				.persistenceUnit("db2")
				.build();
	}

	@Bean(name = "db2TransactionManager")
	public PlatformTransactionManager db2TransactionManager(
			@Qualifier("db2entityManagerFactory") EntityManagerFactory db2entityManagerFactory) {
		return new JpaTransactionManager(db2entityManagerFactory);
	}
}
