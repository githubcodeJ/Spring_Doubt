package com.greatlearning.serviceimpl;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTips;
import com.greatlearning.service.Teacher;
@Component
public class GkTeacher implements Teacher {
	ExamTips examtip;
	public GkTeacher() {
	}
	@Autowired
	public GkTeacher(@Qualifier("revisionTips")ExamTips theExamTip) {

			examtip=theExamTip;
	}
	@Override
	public String gethomework() {
		// TODO Auto-generated method stub
		return "read current affairs";
	}
	

	@Override
	public String getExamTip() {
		// TODO Auto-generated method stub
		return examtip.getExamTip();
	}}
