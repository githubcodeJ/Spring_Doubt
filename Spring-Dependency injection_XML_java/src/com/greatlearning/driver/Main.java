package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.GkTeacher;

public class Main {
public static void main(String[] args) {
	//create an object of teacher
	Teacher teacher=new GkTeacher();
	
	//use the object and retrieve the home work of a particular teacher
	System.out.println(teacher.gethomework());
}
}
