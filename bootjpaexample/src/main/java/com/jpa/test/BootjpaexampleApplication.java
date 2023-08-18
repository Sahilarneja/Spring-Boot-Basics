package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		//1. create -create object of user
//
//		User user=new User();
//		user.setName("Ram");
//		user.setCity("Gurgaon");
//		user.setStatus("Java developer");
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);
//		
//		User user2=new User();
//		user2.setName("Shreya");
//		user2.setCity("Faridabad");
//		user2.setStatus("Student");
//		
//		User resUser=userRepository.save(user2);
//		System.out.println(resUser);
//		
//		//to save multi user in single task
//		List<User> users=List.of(user1,user2); //created a list to save items (could create array too)
//		Iterable<User> result=userRepository.saveAll(users);
//		
//		result.forEach(userres->{
//			System.out.println(userres);
//		});
		
		
		//2.update the data of id=152
		
		//Fetching data using id
//		Optional<User>optional=userRepository.findById(152);
//		User user=optional.get();
//		//updating
//		user.setName("Raghav");
//		User resUser2=userRepository.save(user);
//		
//		System.out.println(user);
		
		
		//3. How to get the data 
		//findById - return Optional containing your data
		
		//to retrieve all data
//		Iterable<User> allUser=userRepository.findAll();
//		System.out.println(allUser);
		
		
		//4. Deleting a user element
//		userRepository.deleteById(103);
//		System.out.println("Deleted");
//		
//		Iterable<User> allUsers=userRepository.findAll();
		
		
		//To delete all users 
//		allUsers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allUsers);
		
		
		//---------------------CUSTOM METHODS---------------------------
		
		
		//findByName()
//		List<User>users=userRepository.findByName("Sahil");
//		users.forEach(e->System.out.println(e));
//		
//		//findByNameAndCity()
//		List<User>users2=userRepository.findByNameAndCity("Krati", "Bhiwadi");
//		users2.forEach(e->System.out.println(e));
//		
//		//findByCityStartingWith()
//		List<User> users3=userRepository.findByCityStartingWith("g");
//		users3.forEach(e->System.out.println(e));
		
		
		//@Query(jpql)
		//getAllUser()
		List<User>allUsers=userRepository.getAllUser();
//		allUsers.forEach(e->System.out.println(e));
		
		
		//getUserByName()
		List<User>user1=userRepository.getUserByName("Sahil");
//		user1.forEach(e->System.out.println(e));
		
		//@Query(native)
		//getUserByCity
		List<User> user2=userRepository.getUserByCity("Rewari");
		user2.forEach(e->System.out.println(e));
	}

}
