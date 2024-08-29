package com.learnmoree.learne.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.learnmoree.learne.entities.User;
import com.learnmoree.learne.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "mariabrown@gmail.com", "9888888","123456");
		User u2 = new User(null, "Alex Green", "alexgreen@gmail.com", "9777777","123456");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
