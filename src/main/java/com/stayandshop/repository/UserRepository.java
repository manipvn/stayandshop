package com.stayandshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stayandshop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select user from User user where user.email = :email")
	User findByEmail(@Param("email") String email);
	
	@Query("select user from User user where user.userName = :userName")
	User findByUserName(@Param("userName") String userName);
	
	@Modifying
	@Query("update User user set user.firstName = :firstName where user.lastName = :lastName")
	int updateFirstNameByLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
	
	@Modifying
	@Query("delete from User user where user.email = :email")
	void deleteUserByEmail(@Param("email") String email);
}
