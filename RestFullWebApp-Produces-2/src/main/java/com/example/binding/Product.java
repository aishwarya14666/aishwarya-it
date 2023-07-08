package com.example.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	private Integer Pid;
	private String Pname;
	private Double Pprice;
	public Integer getPid() {
		return Pid;
	}
	public void setPid(Integer pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public Double getPprice() {
		return Pprice;
	}
	public void setPprice(Double pprice) {
		Pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pprice=" + Pprice + "]";
	}
	public Product(Integer pid, String pname, Double pprice) {
		super();
		Pid = pid;
		Pname = pname;
		Pprice = pprice;
	}
	public Product() {
		super();
	}
	
	
	

}
