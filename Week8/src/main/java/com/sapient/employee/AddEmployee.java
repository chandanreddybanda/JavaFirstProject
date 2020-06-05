package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> e=new ArrayList<>();
	void addEmployee(Employee emp) {
		e.add(emp);
	}
	Employee getEmployee(int id) {
		Employee emp=null;
		if(e==null) return null;
		for(Employee temp:e) {
			if(temp.getId()==id) {
				emp=temp;
			}
		}
		return emp;
	}
}
