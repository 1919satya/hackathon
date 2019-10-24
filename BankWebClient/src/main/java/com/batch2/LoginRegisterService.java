package com.batch2;

import org.springframework.stereotype.Service;

@Service
public interface LoginRegisterService {

	String authentication(String username, String password);

	public Integer save(String username, String password);
	
	Integer[] approveLogin(String username, String password);
	
}
