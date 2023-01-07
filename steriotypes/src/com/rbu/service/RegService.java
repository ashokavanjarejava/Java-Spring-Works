package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rbu.dao.RegDao;
import com.rbu.util.NotificationEmail;

@Service
public class RegService {
	@Autowired
	RegDao dao;
	@Autowired
	NotificationEmail email;
	@Autowired
	RestTemplate restTemplate;

	public RegService() {
		System.out.println("RegService object create:@Service-3");
	}

	public void register() {
		System.out.println("register from RegService...");
		dao.save();
		email.sendEmail();
		Object o = restTemplate.getForObject("https://api.publicapis.org/entries", Object.class);
		System.out.println(o);
	}

}
