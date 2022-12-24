package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.GkTeacher;
import com.greatlearning.serviceimpl.HindiTeacher;
import com.greatlearning.serviceimpl.MathsTeacher;

public class SpringDriver {

	public static void main(String[] args) {
//1.load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//2. retrieve bean from spring container
  Teacher teacher=  context.getBean("hindiTeacher",HindiTeacher.class); // bean id, class name with .class extension
//3.call methods on the bean 	
  System.out.println(teacher.gethomework());
  System.out.println(teacher.getExamTip());
//close the context
  context.close();
	

	}}
