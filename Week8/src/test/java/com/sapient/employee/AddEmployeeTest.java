package com.sapient.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddEmployeeTest {
	AddEmployee a;
	@BeforeEach
	void setUp() throws Exception {
		a=new AddEmployee();
	}

	@Test
	void testEmployee() {
		Employee e=new Employee(101,"Teja","Vijayawada");
		a.addEmployee(e);
		Employee res=a.getEmployee(101);
		assertSame(res, e);
	}
	@Test
	void testEmployeeReturnsNull() {
		Employee e=new Employee(101,"Teja","Vijayawada");
		a.addEmployee(e);
		Employee res=a.getEmployee(102);
		assertNull(res);
	}
	@Test
	void testEmployeeListNull() {
		
		Employee res=a.getEmployee(101);
		assertNull(res);
	}
}
