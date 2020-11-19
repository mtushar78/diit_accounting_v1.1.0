package maksudul.projects.accounting.services;


import maksudul.projects.accounting.model.Users;
import maksudul.projects.accounting.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@ComponentScan
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        AppUser appUser = this.appUserDAO.findUserAccount(userName);
        Users user = userRepository.findByUsername(userName);


        if (user.getUsername() == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }else{
            System.out.println("User found! " + user.getUsername());
        }

        // [ROLE_USER, ROLE_ADMIN,..]
        List<String> roleNames = Collections.singletonList(userRepository.getAuthontication(userName));

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (roleNames != null) {
            for (String role : roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }
        UserDetails userDetails = new User(user.getUsername(), user.getPassword(), grantList);

        return userDetails;
    }
}
