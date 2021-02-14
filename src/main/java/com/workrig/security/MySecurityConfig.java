package com.workrig.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*/

//@Configuration
//@EnableWebSecurity
/*public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("inside configure of MySecurityConfig");
        http
         .csrf().disable()
         .authorizeRequests().anyRequest().authenticated()
         .and()
         .httpBasic();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
    	System.out.println("inside configureGlobal of SecurityConfig");
        auth.inMemoryAuthentication()
            .withUser("nag")
            .password("{noop}mani") //When you are configuring the ClientDetailsServiceConfigurer, you have to also apply the new password storage format to the client secret.
            .roles("USER");
    }
	
	

}*/
