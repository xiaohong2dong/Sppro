package com.pro.d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import com.pro.d.model.User;
import com.pro.d.repository.UserRepository;
import com.pro.d.specs.UserSpecs;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	public void add(User user){
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsersContaining(String name) {
		return userRepository.getFirst2ByNameContaining(name);
	}

	@Override
	public List<User> getUserAgeBetween(Integer sage,Integer eage) {
		return userRepository.findAll(UserSpecs.getUserAgeBetween(sage, eage));
	}

	/**
	 * 实例查询有很大的局限性，如非字符串没有大于小于操作，只有等于操作。性能上有很大的限制，一般不用，简单查询和criteria动态查询使用较多，
	 * 而且criteria动态查询几乎没有什么限制
	 * */
	@Override
	public List<User> getUserByNameLike(String name,Integer mode) {
		User u = new User();
		u.setName(name);
		ExampleMatcher em =ExampleMatcher.matching();
		
		switch (mode) {
		case 0:
			em = em.withMatcher("name", GenericPropertyMatchers.exact());
			break;
		case 1:
			em = em.withMatcher("name", GenericPropertyMatchers.startsWith());
			break;
		case 2:
			em = em.withMatcher("name", GenericPropertyMatchers.contains());
			break;
		case 3:
			em = em.withMatcher("name", GenericPropertyMatchers.endsWith());
			break;
		case 4:
			em = em.withMatcher("name", GenericPropertyMatchers.caseSensitive());
			break;
		case 5:
			em = em.withMatcher("name", GenericPropertyMatchers.endsWith());
			break;
		case 6:
			em = em.withMatcher("name", GenericPropertyMatchers.regex());
			break;
		default:
			em = em.withMatcher("name", GenericPropertyMatchers.storeDefaultMatching());
			break;
		}
		Example<User> example = Example.of(u,em);
		return userRepository.findAll(example);
	}
}
