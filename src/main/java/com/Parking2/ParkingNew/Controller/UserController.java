package com.Parking2.ParkingNew.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Parking2.ParkingNew.Pojo.User;
import com.Parking2.ParkingNew.Service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	User uu;

	@RequestMapping("/")
	public String start() {
		return "index";
	}

	@RequestMapping("/newuser")
	public String userreg() {
		return "NewUser";
	}

	@RequestMapping("/adminlogin")
	public String adminlog() {
		return "Admin_Login";
	}

	@RequestMapping("/userlogin")
	public String userlog() {
		return "User_Login";

	}

	@PostMapping("/register")
	public String registration(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("city") String city,
			@RequestParam("contact") String contact, @RequestParam("field") String field, ModelMap modelMap) {

		userService.addDetails(name, email, password, city, contact, field, modelMap);
		return "registered";

	}

	@RequestMapping("/logedin")
	public String login(@ModelAttribute("u") User u, ModelMap modelMap, HttpServletRequest request) {
		User outhUser = userService.login(u.getEmail(), u.getPassword());
	//	modelMap.put("name", outhUser.getName());
		//modelMap.put("email", outhUser.getEmail());

		if (Objects.nonNull(outhUser)) {
			if (outhUser.getField().equals("Admin")) {

				return "Admin_Panel";
			} else {
				uu = userService.getuserinfo(request.getParameter("email"));
				return "User_Panel";
			}

		} else {
			return "Error_Login";
		}
	}

	@GetMapping("/fetchalluser")
	public String userdata(ModelMap model) {

		return userService.userdata(model);

	}

	@RequestMapping("/book_form")
	public String booking() {
		return "booking_form";
	}

	@GetMapping("/userprofile")
	public String profile(ModelMap modelMap) {
		modelMap.put("result3", uu);
		return "userinfo";
	}
	
	@RequestMapping("/userlogout")
	
	public String logout()
	{
	return "User_Login";
	}
	
	

	@RequestMapping(value="/deleteUser/{userid}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("userid") int userid) {
		ModelAndView model = new ModelAndView();
		userService.deleteUser(userid);
		List<User> list = userService.list();
		model.addObject("displayAllUser",list);
		model.setViewName("displayAllUser");
		return model;

		

	}

}
