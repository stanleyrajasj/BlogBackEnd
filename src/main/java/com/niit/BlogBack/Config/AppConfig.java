package com.niit.BlogBack.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.niit.BlogBack.DAO.UserDaoImpl;
import com.niit.BlogBack.model.Jobs;
import com.niit.BlogBack.model.User;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.niit.BlogBack.*"})
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	@Bean(name = "dataSource")
	public DataSource getH2DataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/blogbackend");
		
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		return dataSource;
		}
	
	private Properties getHibernateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
		}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Jobs.class);

	
		return sessionBuilder.buildSessionFactory();
		}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	@Autowired(required = true)
	@Bean(name="UserDao")
	public UserDaoImpl getUserDaoImpl(SessionFactory session){
		return new UserDaoImpl(session);
				 
	}

	
}
