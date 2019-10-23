package com.batch2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerLoanRepository extends JpaRepository<CustomerLoan, Integer> {
	
	@Query("select cl from CustomerLoan cl where cust_id = ?1 ")
	public List<CustomerLoan> getMyLoans(int cust_id);
}
