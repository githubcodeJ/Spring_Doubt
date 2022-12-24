package com.greatlearning.serviceimpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTips;
@Component
public class RevisionTip implements ExamTips {
	@Override
	public String getExamTip() {
		// TODO Auto-generated method stub
		return "do a lot of revisions";
	}}
