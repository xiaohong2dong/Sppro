package com.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pro.d.model.User;
import com.pro.d.service.UserService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
@ComponentScan({"com.pro.d"})
public class WebDApplication {
	
	@Autowired
	UserService userService;
	@RequestMapping("home")
	@ResponseBody
	private User home(){
		User u =new User();
		u.setId("808");
		u.setAge(10);
		u.setName("dddddd");
		userService.add(u);
		return new User("ddd",10);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebDApplication.class, args);
	}
}
