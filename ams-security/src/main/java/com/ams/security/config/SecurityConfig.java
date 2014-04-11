package com.ams.security.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ams.security.services.AmsUserDetailsService;
import com.baldy.commons.security.services.Roles;


/**
 * @author mbmartinez
 */
@Configuration
@EnableWebSecurity
@ComponentScan("com.ams.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private AmsUserDetailsService userDetailsService;

    @Resource
    private Environment env;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public TextEncryptor textEncryptor() {
        return Encryptors.noOpText();
    }

    @Override
    public void configure(WebSecurity builder) throws Exception {
        builder
        .ignoring()
        .antMatchers("/css/**","/images/**","/javascript/**","/libs/**","/modules/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeUrls()
        .antMatchers("/admin*").hasRole(Roles.ADMIN)
        .antMatchers("/admin/**").hasRole(Roles.ADMIN)
        .antMatchers("/account/activate/**").permitAll()
        .antMatchers("/account*").authenticated()
        .antMatchers("/account/**").authenticated()
        .antMatchers("/tenants").authenticated()

        .antMatchers("/**").permitAll()
        .and()
        .logout()
        .deleteCookies("JSESSIONID")
        .logoutUrl("/logout")
        .logoutSuccessUrl("/auth/login/signout_success")
        .permitAll()
        .and()
        .formLogin()
        .loginPage("/auth/login")
        .loginProcessingUrl("/login/authenticate")
        .defaultSuccessUrl("/account/dashboard", true)
        .failureUrl("/auth/login?error=login.bad.credentials")
        .permitAll()
        .and()
        .rememberMe()
        .key(env.getProperty("remember.me.key"));
    }

    @Bean @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Override
    protected void registerAuthentication(AuthenticationManagerBuilder  builder) throws Exception {
        builder.userDetailsService(userDetailsService);
    }
}
