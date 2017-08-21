package com.pro.d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.d.model.User;
import com.pro.d.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("/home/{name}/{mode}")
	@ResponseBody
	List<User> getAllUsers(@PathVariable String name,@PathVariable Integer mode){
		List<User> au= userService.getUserByNameLike(name,mode);
		return au;
	}
}
