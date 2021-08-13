package com.home.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.user.beans.PhoneInfo;
import com.home.user.data.PhoneInfoRepository;

@Service
public class PhoneInfoService {
	@Autowired
	private PhoneInfoRepository phoneInfoRepository;
	
	public PhoneInfo create(PhoneInfo phoneInfo) {
		return phoneInfoRepository.save(phoneInfo);
	}
}
