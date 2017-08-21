package com.pro.d.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.pro.d.model.User;

public interface UserRepository extends JpaRepository<User,String>,JpaSpecificationExecutor<User>{
	/**
	 * 列出JPA支持的所有查询规范表达式
	 * */
//	public List<User> getByName(String name);
//	public List<User> getByNameAndPwd(String name,String pwd);
//	public List<User> getByNameOrPwd(String name,String pwd);
//	public List<User> getByAgeBetween(Integer minAge,Integer maxAge);
//	public List<User> getByAgeLessThan(Integer age);
//	public List<User> getByAgeLessThanEqual(Integer age);
//	public List<User> getByAgeGreaterThan(Integer age);
//	public List<User> getByAgeGreaterThanEqual(Integer age);
//	Equal with getByAgeGreaterThan(Integer age)
//	public List<User> getByAgeAfter(Integer age);
//	//Equal with getByAgeLessThan(Integer age)
//	public List<User> getByAgeBefore(Integer age);
//	public List<User> getByAgeIsNull();
//	public List<User> getByAgeIsNotNull();
//	
//	//模糊查询
//	public List<User> getByNameLike(String name);
//	//+%name
//	public List<User> getByNameStartingWith(String name);
//	//+name%
//	public List<User> getByNameEndingWith(String name);
	//+%name%
	public List<User> getFirst2ByNameContaining(String name);
//	@QueryHints(value={@QueryHint(name="name",value="value")},forCounting=false)
	public List<User> getFirstByAge(Integer age);
	
	
	/**
	 * 排序
	 * */
//	public List<User> getByNameOrderByAgeDesc(String name);
//	public List<User> getByNameOrderByAgeAesc(String name);
//	//name not equal 或者 name !=
//	public List<User> getByNameNot(String name);
//	public List<User> getByAgeIn(Collection<?> ages);
//	public List<User> getByAgeNotIn(Collection<?> ages);
//	
//	//是否操作
//	public List<User> getByAgeTrue();
//	public List<User> getByAgeFalse();
//	public List<User> getByNameIgnoreCase(String name);
}
