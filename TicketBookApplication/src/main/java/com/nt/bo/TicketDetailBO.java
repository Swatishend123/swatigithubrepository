package com.nt.bo;

public class TicketDetailBO {
	
	private String name;
	private String email;
	private String gender;
	private String DateOfBirth;
	private String mobile;
	private String addrress;
	private String pwt;
	
	public TicketDetailBO(String emailID, String passwoed) {
		this.email = emailID;
		this.pwt = passwoed;
		
	}
	
	public TicketDetailBO(String name, String email, String gender, String dateOfBirth, String mobile, String addrress,
			String pwt) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		DateOfBirth = dateOfBirth;
		this.mobile = mobile;
		this.addrress = addrress;
		this.pwt = pwt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public String getPwt() {
		return pwt;
	}
	public void setPwt(String pwt) {
		this.pwt = pwt;
	}
	
	@Override
	public String toString() {
		return "TicketDetailBO [name=" + name + ", email=" + email + ", gender=" + gender + ", DateOfBirth="
				+ DateOfBirth + ", mobile=" + mobile + ", addrress=" + addrress + ", pwt=" + pwt + "]";
	}

	
}
