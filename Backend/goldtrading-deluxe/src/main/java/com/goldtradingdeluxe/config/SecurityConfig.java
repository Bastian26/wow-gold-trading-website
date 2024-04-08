package com.goldtradingdeluxe.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@RequiredArgsConstructor
//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf(csrf -> csrf.disable())
//                        .authorizeHttpRequests((requests) -> requests
//                            .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
//                            .requestMatchers("/**", "/messages").permitAll())
//                        .formLogin(Customizer.withDefaults())
//                        .httpBasic(Customizer.withDefaults())
//                        .sessionManagement(session -> session
//                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));;
//        return httpSecurity.build();
//    }
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf(csrf -> csrf.disable())
//                .authorizeRequests(authorizeRequests -> authorizeRequests
//                        .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
//                        .antMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
//                        .antMatchers(HttpMethod.POST, "/login").permitAll()
//                        .antMatchers("/**", "/messages").permitAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }
}
