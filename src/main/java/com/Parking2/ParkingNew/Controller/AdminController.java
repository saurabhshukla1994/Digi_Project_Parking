package com.Parking2.ParkingNew.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Parking2.ParkingNew.Pojo.Admin;
import com.Parking2.ParkingNew.Pojo.User;
import com.Parking2.ParkingNew.Service.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/parkingform")
	public String park()
	{
		return "Park_Detail_Form";
	}
	
	@PostMapping("/parkinfo")
	public String registration(@RequestParam("floor") String floor, @RequestParam("vehicle_type") String vehicle_type,
			@RequestParam("avl_slot") String avl_slot, @RequestParam("booked_slot") String booked_slot, ModelMap modelMap) {

		adminService.addParkDetail(floor, vehicle_type, avl_slot, booked_slot, modelMap);
		return "park_detail";

}
	@GetMapping("/fetchallslot")
    public String parkingdata(ModelMap modelMap) {
      
      
      return adminService.parkingdata(modelMap);
        
    }
	@GetMapping("/fetchAllSlotForAdmin")
    public String ParkingDataForAdmin(ModelMap modelMap) {
      
      
      return adminService.ParkingDataForAdmin(modelMap);
        
    }
	
	@RequestMapping(value="/deleteSlot/{parkingid}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("parkingid") int parkingid) {
		ModelAndView model = new ModelAndView();
		adminService.deleteSlot(parkingid);
		List<Admin> list = adminService.list();
		model.addObject("SlotListForAdmin",list);
		model.setViewName("SlotListForAdmin");
		return model;

		

	}
	
	
	@RequestMapping("/adminlogout")
	
		public String logout()
		{
		return "User_Login";
		}
		
	
	
	
	
}
