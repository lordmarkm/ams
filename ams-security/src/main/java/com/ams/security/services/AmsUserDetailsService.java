package com.ams.security.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baldy.commons.security.models.Account;
import com.baldy.commons.security.services.AccountService;

/**
 * @author mbmartinez
 */
@Service
public class AmsUserDetailsService implements UserDetailsService {

    private static Logger log = LoggerFactory.getLogger(AmsUserDetailsService.class);

    @Resource
    private AccountService accounts;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("Checking username [{}]", username);

        Account account = accounts.findByUsername(username);
        if(null == account) {
            throw new UsernameNotFoundException("User " + username + " not found.");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        String[] authStrings = account.getAuthorities().split(", ");
        for(String authString : authStrings) {
            authorities.add(new SimpleGrantedAuthority(authString));
        }
        
        UserDetails ud = new User(account.getUsername(), account.getPassword(), authorities);
        log.info("Found: {}", ud);
        return ud;
    }

}
