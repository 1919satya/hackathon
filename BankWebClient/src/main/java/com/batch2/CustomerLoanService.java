package com.batch2;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CustomerLoanService {
   public CustomerLoan save(CustomerLoan cl);
   
   public List<CustomerLoan> getMyLoans(int cust_id);
}
