package com.batch2;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	 @Query("select max(c.cust_id) from Customer c ")
	 Integer getCust_id();
	 @Query("select c.cust_id from Customer c where login_id=?1")
	 Integer getCust_idByLogin_id(int login_id);
}