package com.expertise_tech.gebu.security.config;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.security.user.User;
import com.expertise_tech.gebu.security.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{
	
	 private final UserRepository userRepository;
	 
	@Override 
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		 User user = userRepository.findByEmail(email);
		 if (user == null) {
	            throw new UsernameNotFoundException("User not found with email: " + email);
	        }
	        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
	                Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
	}

}
