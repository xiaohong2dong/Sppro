package com.pro.d.service;

import java.util.List;

import com.pro.d.model.User;

public interface UserService {
	public void add(User user);
	public List<User> getAllUsersContaining(String name);
	public List<User> getUserAgeBetween(Integer sage,Integer eage);
	public List<User> getUserByNameLike(String name, Integer mode);
}
