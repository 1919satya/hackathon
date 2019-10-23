package com.batch2;

public class Address {
	private int add_id;
	private String name;
	private String house_no;
	private String street;
	private String city;
	private String state;
	private String country;
	private String near_by;
	private int area_code;
	private String email;
	private String phoneno;
	private int login_id;
	
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNear_by() {
		return near_by;
	}
	public void setNear_by(String near_by) {
		this.near_by = near_by;
	}
	public int getArea_code() {
		return area_code;
	}
	public void setArea_code(int area_code) {
		this.area_code = area_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", name=" + name + ", house_no=" + house_no + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", near_by=" + near_by
				+ ", area_code=" + area_code + ", email=" + email + ", phoneno=" + phoneno + ", login_id=" + login_id
				+ "]";
	}
	
}













