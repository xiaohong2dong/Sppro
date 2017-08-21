package com.pro.d.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User {
	
	private String id;
	private String name;
	private String pwd;
	private Integer age;
	
	public User(){
		
	}
	public User(String name,Integer age){
		this.name =name;
		this.age = age;
	}
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	@Column(name="u_name")
	public String getName() {
		return name;
	}
	@Column(name="u_age")
	public Integer getAge() {
		return age;
	}
	@Column(name="u_pwd")
	public String getPwd() {
		return pwd;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
