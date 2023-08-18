package com.jpa.test.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;


public interface UserRepository extends CrudRepository<User,Integer>
{
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
	
	public List<User> findByCityStartingWith(String prefix);
	
	//jpql
	@Query("select u FROM User u")        //u=user
	public List<User> getAllUser();
	
	
	@Query("select u FROM User u WHERE u.name =:n") //parameterized query
	public List<User> getUserByName(@Param("n") String name);

	
	
	//Using sql query /nativeQuery

	@Query(value="select*from user where city=?", nativeQuery = true)
	public List<User> getUserByCity(String city);
}
