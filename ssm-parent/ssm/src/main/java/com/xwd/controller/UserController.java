package com.xwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwd.model.User;
import com.xwd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    
	@Autowired
    UserService userService;
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index";
	}
	
	@RequestMapping("/addUser")
	public String toAddUser(User u,Model model){
		userService.addUser(u);
		return "page/success";
	}
	@RequestMapping("toUpdateUser")
	public String toUpdateUser(User u,Model model){
		boolean flag = userService.updateUser(u);
		if(flag){
			return "redirect:page/success";
		}else{
			return "redirect:page/error";
		}
	}
	@RequestMapping("toDeleteUserById")
	public String toDeleteUserById (Long id,Model model){
		Boolean flag = userService.deleteUserById(id);
		if(flag){
			return "redirect:page/success";
		}else{
			return "redirect:page/error";
		}
	}
	@RequestMapping("findUserById")
	public String findUserById(int id,Model model){
		User u = userService.findUserById(id);
		model.addAttribute("user", u);
		return "/page/userShow";
	}
}
