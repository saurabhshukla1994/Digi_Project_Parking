package com.Parking2.ParkingNew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Parking2.ParkingNew.Pojo.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
