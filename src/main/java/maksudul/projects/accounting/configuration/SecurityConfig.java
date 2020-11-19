package maksudul.projects.accounting.configuration;

import maksudul.projects.accounting.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable().authorizeRequests()
                .antMatchers("/rptstudentledgercheck", "/createpaymentheads", "/createprograms",
                        "/createbatches", "/paymentcollection", "/savestudentpayments/{instantPay}", "/savestudentpayments",
                        "/rptstudentledger", "/rptbatchledger", "/studentwaiversetup", "/savestudentdiscount", "/rptcollection",
                        "/inactivewaiveditem", "/saveheads/{tempHeadId}", "/createpersoninfo/", "/savepersoninfo/**",
                        "/saveprograms/{tempHeadId}",
                        "/saveprogrambatch/{tempBatchId}", "/createsemester", "/savesemester", "/savestudentpayable",
                        "/getAllProgramBatchs", "/getCGPASchemeByProgramBatch", "/getallcgpascheme", "/getAllPrograms",
                        "/getpersonwisestudent", "/getstudentpaymentinfo", "/getallstudentinfos", "/getallpaymentheads", "/deleteHead/**", "/registerUser", "/test-head").hasAuthority("ROLE_ALL")
                .antMatchers("/static", "/login", "/get-student-paymentinfo-bank", "/save-student-payments-bank/**",
                        "/loggedout", "/login2", "/error", "/css/**", "/images/**", "/deleteHead/**", "/getallpaymentheads").permitAll()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .loginProcessingUrl("/login").permitAll()
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
                .and().authorizeRequests().anyRequest().authenticated();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
