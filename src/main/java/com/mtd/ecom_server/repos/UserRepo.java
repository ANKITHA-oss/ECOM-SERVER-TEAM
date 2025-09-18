package com.mtd.ecom_server.repos;

import java.util.Optional;

import org.springframework.data.mongodb.respository.MongoRespository;

import com.mtd.ecom_server.models.User;

public interface UserRepo extends MongoRespository<User, String> {
	
	Optional<User> findByEmail(String email);

}
