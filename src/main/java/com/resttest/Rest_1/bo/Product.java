package com.resttest.Rest_1.bo;

public class Product {
	
	String pName;
	int pid;
	String pBrand;
	
	public Product(String pName, int pid, String pBrand) {
		this.pName=pName;
		this.pid=pid;
		this.pBrand=pBrand;
		
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pid=" + pid + ", pBrand=" + pBrand + "]";
	}
	

}
