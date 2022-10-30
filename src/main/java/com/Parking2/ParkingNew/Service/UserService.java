package com.Parking2.ParkingNew.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.Parking2.ParkingNew.Pojo.User;
import com.Parking2.ParkingNew.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public void addDetails(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("city") String city,
			@RequestParam("contact") String contact, @RequestParam("field") String field, ModelMap modelMap) {

		User u = new User();
		u.setUserid(u.getUserid());
		u.setName(name);
		u.setPassword(password);
		u.setEmail(email);
		u.setCity(city);
		u.setContact(contact);
		u.setField(field);

		this.userRepo.save(u);
		modelMap.put("userid", u.getUserid());

		modelMap.put("name", name);
		modelMap.put("email", email);
		modelMap.put("password", password);
		modelMap.put("city", city);
		modelMap.put("contact", contact);
		modelMap.put("field", field);

	}

	public User login(String email, String password) {
		User u = userRepo.findByEmailAndPassword(email, password);
		System.out.println(u.getName() + "name in service");
		return u;

	}

	public String userdata(ModelMap model) {

		List<User> user = new ArrayList<User>();
		userRepo.findAll().forEach(i -> user.add(i));
		model.addAttribute("result", user);

		return "displayAllUser";
	}

	public User getuserinfo(String email) {
		User u3 = userRepo.findByEmail(email);

		return u3;
	}
	public List<User> list() {
		List <User> us=(List<User>) userRepo.findAll();
		return us;
	}
	public void deleteUser(int userid) {

		userRepo.deleteById(userid);

	}

	

}
