package com.hbo.ood;

public class GreetingProps {
	private String fname;
	private String lname;
	private String printTo;
	private String customMsg;
	private String msgFrom;
	
		
	public String getMsgFrom() {
		return msgFrom;
	}
	public void setMsgFrom(String msgFrom) {
		this.msgFrom = msgFrom;
	}
	public String getCustomMsg() {
		return customMsg;
	}
	public void setCustomMsg(String customMsg) {
		this.customMsg = customMsg;
	}
	public String getPrintTo() {
		return printTo;
	}
	public void setPrintTo(String printTo) {
		this.printTo = printTo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public void display(){
		System.out.println(getFname());
	}
}
