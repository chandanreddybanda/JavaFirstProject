package com.sapient.problem3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/display")
	public ModelAndView display(@RequestParam String student_id)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/Spring.xml");
		
		StudentList studentList=(StudentList)context.getBean("StudentList");
		
		ModelAndView model = new ModelAndView("/display");
		
		
		for (Map.Entry<String,StudentPOJO> entry : studentList.getStudent_list().entrySet())  
		{
            if( student_id.equals(entry.getKey())) {
            	model.addObject("user",entry.getValue());
            } 
                        
    	} 
		
		return model;
	}

}
