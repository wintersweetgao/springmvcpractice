package com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author dongmei.gao
 * @date 2019/6/6 8:30
 */
//@EnableWebSecurity(debug = true)
//@Configuration   extends WebSecurityConfigurerAdapter
public class SecurityConfig {

   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //配置拦截路径以及认证通过的身份，此处拦截任意/admin/**路径，必须以ADMIN身份登录
                .antMatchers("/spi//register/**").access("hasRole('ROLE_ADMIN')")
                //配置拦截路径以及认证通过的身份，此处指定只有访问/dba/**的GET请求会被拦截认证，必须以DBA或者ADMIN的身份登录
                .antMatchers(HttpMethod.GET,"/spi/nopara/**").access("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
                //表明除了上述路径需要拦截认证外，其余路径全部不进行认证
                .anyRequest().permitAll().and()
                //需要https的，在所有请求后都加上s
                .requiresChannel().antMatchers("/**").requiresInsecure();

*//*                //add()方法用于连接各种配置指令
                .and()
                //当重写configure(HttpSecurity http)方法后，将失去Spring Security的默认登录页，可以使用formLogin()重新启用
                .formLogin();*//*
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication().withUser("user").roles("USER").and()
               .withUser("admin").roles("USER","ADMIN");
    }*/
}
