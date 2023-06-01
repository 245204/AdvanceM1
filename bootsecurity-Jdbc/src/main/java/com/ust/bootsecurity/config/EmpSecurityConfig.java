package com.ust.bootsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class EmpSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	DataSource dataSource;//Will have info about database details like password username port number etc
	//spring framework will inject datasource
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {//security manager uses the authenticationmanagerbuilder
		auth.jdbcAuthentication().dataSource(dataSource);
	}
	@Bean
	@SuppressWarnings("deprecation")
	public PasswordEncoder getPassowrdEnoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected  void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").antMatchers("/user").hasAnyRole("USER")
		.antMatchers("/").permitAll() //default anyone can access.this is the root endpoint
		.and().formLogin();//mechanism been used
	}

}
