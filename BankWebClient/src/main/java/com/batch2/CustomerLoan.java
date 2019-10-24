package com.batch2;

import java.beans.Transient;
import java.util.Date;

public class CustomerLoan {

	private Integer loan_id;
	private Integer cust_id;
	private Integer item_id;
	private Date applied_on;
	private String status;
	private double appliedAmount;
	private double approvedAmount;

	public Integer getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Integer loan_id) {
		this.loan_id = loan_id;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public Date getApplied_on() {
		return applied_on;
	}

	public void setApplied_on(Date applied_on) {
		this.applied_on = applied_on;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAppliedAmount() {
		return appliedAmount;
	}

	public void setAppliedAmount(double appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

	public double getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(double approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	@Override
	public String toString() {
		return "CustomerLoan [loan_id=" + loan_id + ", cust_id=" + cust_id + ", item_id=" + item_id + ", applied_on="
				+ applied_on + ", status=" + status + ", appliedAmount=" + appliedAmount + ", approvedAmount="
				+ approvedAmount + "]";
	}

	

	

	
}
