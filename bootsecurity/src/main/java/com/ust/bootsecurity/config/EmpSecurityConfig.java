package com.ust.bootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity //annotation for websecurity
public class EmpSecurityConfig extends WebSecurityConfigurerAdapter { //custom security configuration
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {//security manager uses the authenticationmanagerbuilder
		auth.inMemoryAuthentication()//credentials will be stored somewhere in the local cache
		.withUser("bond").password("james").roles("USER").and().withUser("poo").password("bear").roles("ADMIN");
		
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
