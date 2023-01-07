package com.rbu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RegDao {
	
	public RegDao() {
	System.out.println("RegDao object create:@Repository-2");
	}

	public void save() {
		System.out.println("save from Dao...");
		
	}

}
