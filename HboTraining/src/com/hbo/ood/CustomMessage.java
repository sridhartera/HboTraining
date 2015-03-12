package com.hbo.ood;

import java.util.Calendar;



public class CustomMessage {
	private String fname;
	private String lname;
	private String customMsg;
	private String msgFrom;
	private String greetMsg;
	
	
	
	public CustomMessage(){
		GreetingProps g = new GreetingProps();
		fname = g.getFname();
		lname = g.getLname();
		customMsg = g.getCustomMsg();
		msgFrom = g.getMsgFrom();
		
		
		if (customMsg == null){
			printGreeting();			
		}else {
			printCustomGreeting();
		}
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	
			
	public String getGreeting(){
        Calendar cal = Calendar.getInstance(); 
        int hr = cal.get(Calendar.HOUR_OF_DAY);
        //log.info("hr:"+ hr);
        String greet = "";
        if(hr < 12 ){        	
        	greet = "Good Morning";	        	
        }else if(hr < 18 ){
        	greet = "Good Afternoon";        	
        }else{
        	greet = "Good Evening";
        }   
        
		return greet;		
	}
	
	public void printGreeting(){
		String fullName = fname + " " + lname;
		
		String greet = getGreeting();
        //System.out.println("fullname: "+ fullName);
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(fullName).append(", ").append(greet);
		String str = sb.toString();
		setGreetMsg(str);
		
		//System.out.println("Hello " + fullName + ", " + greet);
	}
	public void printCustomGreeting(){
		printGreeting();
		String str2 = getGreetMsg();
		StringBuilder sb2 = new StringBuilder();
		sb2.append(str2);
		sb2.append("custom message: ").append(customMsg).append("from ").append(msgFrom);
		setGreetMsg(sb2.toString());
		//System.out.println("custom message: " + customMsg + "from " + msgFrom);
	}

}
