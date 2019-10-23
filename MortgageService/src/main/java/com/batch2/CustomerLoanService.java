package com.batch2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoanService {
   @Autowired
   CustomerLoanRepository customer_LoanRepository;
   
   public CustomerLoan save(CustomerLoan cl) {
	   return  customer_LoanRepository.save(cl);   
   }
   
   public List<CustomerLoan> getMyLoans(int cust_id){
	   return customer_LoanRepository.getMyLoans(cust_id);
   }
}
