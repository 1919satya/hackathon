package com.batch2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name="loan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loan_id")
    private int id;
	@Column
    private double loanamount;
	@Column
    private int area_code;
	@Column
    private double area_size;
	@Column
    private double credit_score;
	@Column
    private String legal_residence;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
	public double getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(double credit_score) {
		this.credit_score = credit_score;
	}
	
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public int getArea_code() {
		return area_code;
	}
	public void setArea_code(int area_code) {
		this.area_code = area_code;
	}
	public double getArea_size() {
		return area_size;
	}
	public void setArea_size(double area_size) {
		this.area_size = area_size;
	}
	public String getLegal_residence() {
		return legal_residence;
	}
	public void setLegal_residence(String legal_residence) {
		this.legal_residence = legal_residence;
	}
	@Override
	public String toString() {
		return "Loan [loan_id=" + id + ", loanamount=" + loanamount + ", area_code=" + area_code + ", area_size="
				+ area_size + ", credit_score=" + credit_score + ", legal_residence=" + legal_residence + "]";
	}
	  
}
