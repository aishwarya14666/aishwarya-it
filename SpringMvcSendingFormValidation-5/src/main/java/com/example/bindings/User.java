package com.example.bindings;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotEmpty(message="Uname cannot be empty")
	@Size(min=3,max=8,message="Uname should be 3 to 8 characters")
	private String uname;
	
	@NotEmpty(message="Password cannot be empty")
	private String pwd;
	
	@NotEmpty(message="Email cannot be empty")
	@Email(message="Enter valid email")
	private String email;
	
	@NotEmpty(message="PNo cannot be empty")
	@Size(min=10,message="Phno should be atleast 10 digits")
	private String pno;
	
	@NotNull(message="Age cannot be empty")
	@Min(value=21,message="Age should be minium 21 years")
	@Max(value=60,message="Age should be maximum 60 years")
	private Integer age;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	//}
	
	//public Product(Integer productId, String productName, double productPrice){
		
		//productId=productId;
		//productName=productName;
		//productPrice=productPrice;
			
		}
	//public Product() {
		// TODO Auto-generated constructor stub
	}

	

//}
