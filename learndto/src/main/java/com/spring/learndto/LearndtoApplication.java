package com.spring.learndto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.learndto.model.Location;
import com.spring.learndto.model.User;
import com.spring.learndto.repository.LocationRepository;
import com.spring.learndto.repository.UserRepository;

@SpringBootApplication
public class LearndtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearndtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Malang");
		location.setDescription("Malang kota mbois");
		location.setLatitude(40.5);
		location.setLongitude(30.6);
		locationRepository.save(location);


		User user1 = new User();
		user1.setFirstName("Besta");
		user1.setLastName("Alfidi");
		user1.setEmail("alfidibesta@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);
		
		
		User user2 = new User();
		user2.setFirstName("abang");
		user2.setLastName("nackal");
		user2.setEmail("abangnackal@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
		
	}

}
