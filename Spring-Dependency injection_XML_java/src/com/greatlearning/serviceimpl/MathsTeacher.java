package com.greatlearning.serviceimpl;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTips;
import com.greatlearning.service.Teacher;
@Component
public class MathsTeacher implements Teacher {
	ExamTips examtip;
	public MathsTeacher() {
	}
	@Autowired
	public MathsTeacher(@Qualifier("SolvethePreviousYearpaper")ExamTips theExamTip) {
		examtip=theExamTip;
	}
	@Override
	public String gethomework() {
		return "practice any ten maths problem";
	}
	
	@Override
	public String getExamTip() {
		// TODO Auto-generated method stub
		return examtip.getExamTip();
	}}
