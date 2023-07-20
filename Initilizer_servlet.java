package de.zeroco.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "de.zeroco.company")
public class Initilizer_servlet {

//	@Bean(name = "datasource")
//	public DriverManagerDataSource getDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/");
//		dataSource.setUsername("admin");
//		dataSource.setPassword("Pr@veen12");
//		return dataSource;
//	}
//	
//	@Bean(name = "JdbcTemplate")
//	public JdbcTemplate getJdbcTemplate() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(getDataSource());
//		return jdbcTemplate;
//	}
	
}
