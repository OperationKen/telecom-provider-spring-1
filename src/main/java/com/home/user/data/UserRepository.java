package com.home.user.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.home.user.beans.User;



@Repository // manages transaction processing
public interface UserRepository extends JpaRepository<User, Integer> {
	
	String tableName = "telecom_provider_demo";
	
	
	// CRUD methods
	@Query(value = "SELECT * FROM " + tableName + " WHERE userName = ?1", nativeQuery = true)
	public List<User> findByUserName(String userName); 
	
	@Query(value = "INSERT INTO  " + tableName + " VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
	public void addDevice(String userName, String device, String number, String plan); 
	
	@Query(value = "SELECT count(*) FROM " + tableName + " WHERE userName =?1", nativeQuery = true)
	public Integer entriesByUserName(String userName); 
	
	// plans by user
	@Query(value = "SELECT plan FROM " + tableName + " WHERE userName =?1", nativeQuery = true)
	public List<String> getPlansByUserName(String userName); 
	

}
