package com.greatlearning.serviceimpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTips;
@Component
public class SolvePreviousyearsPaper implements ExamTips{

	

	@Override
	public String getExamTip() {
		// TODO Auto-generated method stub
		return "solve last 5 years question paper";
	}

}
