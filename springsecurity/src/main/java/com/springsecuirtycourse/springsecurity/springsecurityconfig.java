package com.springsecuirtycourse.springsecurity;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class springsecurityconfig {

        @Bean
        SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests((requests) ->

                    requests.requestMatchers("/h2-console/**").permitAll().
                            anyRequest().authenticated());// reuqest needs to authenticated
            http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  // to remove cookies not make session stateless

          //  http.formLogin(withDefaults());  form based authentication
            http.httpBasic(withDefaults()); // basic authentication

            http.headers(headers->
                    headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));

            http.csrf(csrf-> csrf.disable());
            return http.build();  // return the object
        }


        // in memory user details manager
        @Bean  // multiple users fetch from inmemeory authentication
        public UserDetailsService userdetailsservice(){

            // it provides core user information
            UserDetails user1= User.
                    withUsername("user1").password("{noop}password1").roles("user").build();

            UserDetails admin= User.withUsername("admin").password("{noop}adminpass").roles("admin").build();

            return new InMemoryUserDetailsManager(user1,admin);

        }




}
