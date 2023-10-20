package com.examplejpa.demoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.examplejpa.demoone.dao.UserRepository;
import com.examplejpa.demoone.entities.User;

@SpringBootApplication
public class DemooneApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemooneApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		User user=new User();
		user.setName("MAyuresh");
		user.setCity("Pune");
		
		User user3=new User();
		user3.setName("Harsh");
		user3.setCity("Pune");
		
		User user4=new User();
		user4.setName("Shubham");
		user4.setCity("Pune");
		
		
		//To Save The Users In Database
		User user1=userRepository.save(user);
		User user2=userRepository.save(user3);
		User user5=userRepository.save(user4);
		
		
	   //to Delete The data From database
		userRepository.deleteById(54);
		
		
		System.out.println(user1);
		System.out.println(user3);
		System.out.println(user4);
		
		
	}

}
