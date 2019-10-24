package com.batch2;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
	public Integer getCust_idByLogin_id(Integer login_id);
}
