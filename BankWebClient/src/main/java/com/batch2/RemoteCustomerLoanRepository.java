package com.batch2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class RemoteCustomerLoanRepository implements CustomerLoanService {

	@Autowired
	protected RestTemplate restTemplate;  
	
	String serviceUrl;
	
	
	private static final Logger logger = Logger.getLogger(RemoteCustomerLoanRepository.class);
	
	public RemoteCustomerLoanRepository() {
		super();
	}

	public RemoteCustomerLoanRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://"+serviceUrl;
	}

	@Override
	public CustomerLoan save(CustomerLoan cl) {
		String url = serviceUrl + "/applyloan";
		logger.info(url);
		 ResponseEntity<CustomerLoan> result=restTemplate.postForEntity(url, cl, CustomerLoan.class);
	    logger.info(result);
		return result.getBody();
	}

	@Override
	public List<CustomerLoan> getMyLoans(int cust_id) {
		String url = serviceUrl + "/existingLoan?cust_id="+cust_id;
		logger.info(url);
		CustomerLoan[] result=restTemplate.getForObject(url, CustomerLoan[].class,cust_id );
	    logger.info(result);
		return Arrays.asList(result);
	}

}
