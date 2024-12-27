package com.company.security.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable() // Disable CSRF for simplicity
				.authorizeHttpRequests(auth -> auth.requestMatchers("/public/").permitAll() // Public endpoints
						.requestMatchers("/admin/").hasRole("ADMIN") // Only for ADMIN
						.anyRequest().authenticated() // All other endpoints require authentication
				).httpBasic(); // Use HTTP Basic Authentication (or formLogin() for form-based)
		return http.build();
	}

}
