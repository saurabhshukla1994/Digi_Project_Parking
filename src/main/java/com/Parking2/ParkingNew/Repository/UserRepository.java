package com.Parking2.ParkingNew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Parking2.ParkingNew.Pojo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByEmailAndPassword(String email, String password);

	User findByEmail(String email);

	

	
}
