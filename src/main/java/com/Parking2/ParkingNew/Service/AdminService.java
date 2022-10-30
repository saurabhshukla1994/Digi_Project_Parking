package com.Parking2.ParkingNew.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.Parking2.ParkingNew.Pojo.Admin;
import com.Parking2.ParkingNew.Pojo.User;
import com.Parking2.ParkingNew.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepo;

	public void addParkDetail(@RequestParam("floor") String floor, @RequestParam("vehicle_type") String vehicle_type,
			@RequestParam("avl_slot") String avl_slot, @RequestParam("booked_slot") String booked_slot,
			ModelMap modelMap) {

		Admin a = new Admin();
		a.setParkingid(a.getParkingid());
		a.setFloor(floor);
		a.setVehicle_type(vehicle_type);
		a.setAvl_slot(avl_slot);
		a.setBooked_slot(booked_slot);

		this.adminRepo.save(a);
		modelMap.put("parkingid", a.getParkingid());

		modelMap.put("floor", floor);
		modelMap.put("vehicle_type", vehicle_type);
		modelMap.put("avl_slot", avl_slot);
		modelMap.put("booked_slot", booked_slot);

	}

	public String parkingdata(ModelMap modelMap) {

		List<Admin> admin = new ArrayList<Admin>();
		adminRepo.findAll().forEach(j -> admin.add(j));
		modelMap.addAttribute("result", admin);
		

		return "displayAllSlot";
		
		
	}
	
	public String ParkingDataForAdmin(ModelMap modelMap) {

		List<Admin> admin = new ArrayList<Admin>();
		adminRepo.findAll().forEach(k -> admin.add(k));
		modelMap.addAttribute("result", admin);
		

		return "SlotListForAdmin";
		
		
	}
	public List<Admin> list() {
		List <Admin> admin=(List<Admin>) adminRepo.findAll();
		return admin;
	}
	
	public void deleteSlot(int parkingid) {

		adminRepo.deleteById(parkingid);

	}

	
	
    
	

}
