package com.batch2;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	 @Id
     private Integer cust_id;
	 @Column
     private String name;
	 @Column
     private Integer type;
	 @Column
     private double credit_score;
	 @Column
     private Integer add_id;
	 @Column
	 private Integer login_id;
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public double getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(double credit_score) {
		this.credit_score = credit_score;
	}
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	
	public Integer getLogin_id() {
		return login_id;
	}
	public void setLogin_id(Integer login_id) {
		this.login_id = login_id;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", type=" + type + ", credit_score=" + credit_score
				+ ", add_id=" + add_id + ", login_id=" + login_id + "]";
	}
	
     
} 