package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTips;
import com.greatlearning.service.Teacher;
@Component
public class HindiTeacher implements Teacher {

	
	//private field for dependency
	ExamTips examtip;
	public HindiTeacher() {
	}
	@Autowired
	public HindiTeacher(@Qualifier("revisonTips")ExamTips theExamTip) {
		examtip=theExamTip;
	}
	
	@Override
	public String gethomework() {
		return "do one page of hindi writing";
	}

@Override
public String getExamTip() {
	// TODO Auto-generated method stub
	return examtip.getExamTip();
}
}
