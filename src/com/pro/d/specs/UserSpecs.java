package com.pro.d.specs;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.pro.d.model.User;

public class UserSpecs{

	public static Specification<User> getUserAgeGt10(){
		return new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				return null;
			}
		};
	}
	
	public static Specification<User> getUserAgeLt20(){
		return new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return null;
			}
		};
	}
	
	public static Specification<User> getUserAgeBetween(Integer sage,Integer eage){
		return new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path<Integer> age= root.get("age");
				Predicate p = cb.and(cb.greaterThan(age, 10),cb.lessThan(age, 20));
				return p;
			}
		};
	}
}
