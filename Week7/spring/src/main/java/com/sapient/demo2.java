package com.sapient;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo2 {
	Map<String, employeePOJO> m;

	public Map<String, employeePOJO> getM() {
		return m;
	}

	public void setM(Map<String, employeePOJO> m) {
		this.m = m;
	}

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		demo2 d = (demo2) c.getBean("demo");
		System.out.println("Enter ID");
		String s = Read.br.next();
		System.out.println("Name: " + d.m.get(s).name);
		System.out.println("City: " + d.m.get(s).city);
	}

}
