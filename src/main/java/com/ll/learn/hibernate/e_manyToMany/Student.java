package com.ll.learn.hibernate.e_manyToMany;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Administrator
 *
 */
public class Student {

	private Integer id;
	
	private String name;
	
	private Set<Teacher> teachers = new HashSet<Teacher>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
