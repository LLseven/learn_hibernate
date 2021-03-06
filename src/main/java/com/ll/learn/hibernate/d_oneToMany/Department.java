package com.ll.learn.hibernate.d_oneToMany;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门信息
 * @author Administrator
 *
 */
public class Department {

	private Integer id;
	
	private String name;
	
	private Set<Employee> employees = new HashSet<Employee>();

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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
