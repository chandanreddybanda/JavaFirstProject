package com.sapient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
@Lazy
@Configuration
public class demo {

	@Bean
	@Scope("prototype")
	public employeePOJO employee() {
		return new employeePOJO();
	}

	@Bean
	public employeeList f() {
		Map<String, employeePOJO> m = new HashMap<String, employeePOJO>();
		employeePOJO e1 = employee();
		e1.setId("101");
		e1.setName("M");
		e1.setCity("Warangal");
		m.put("101", e1);
		employeePOJO e2 = employee();
		e2.setId("102");
		e2.setName("S");
		e2.setCity("Warangal");
		m.put("102", e2);
		employeePOJO e3 = employee();
		e3.setId("103");
		e3.setName("D");
		e3.setCity("Warangal");
		m.put("103", e3);
		employeeList e=new employeeList();
		e.setM(m);

		return e;
	}

	public static void main(String[] args) {
		ApplicationContext c = new AnnotationConfigApplicationContext(demo.class);
		employeeList d = c.getBean(employeeList.class);
		System.out.println("Enter ID");
		String s1 = Read.br.next();
		System.out.println("Name: " + d.m.get(s1).name);
		System.out.println("City: " + d.m.get(s1).city);
	}

}
