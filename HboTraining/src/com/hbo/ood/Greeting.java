package com.hbo.ood;


//import org.apache.log4j.xml.DOMConfigurator;

public class Greeting {

	/**
	 * Greeting.java takes arguments: first name last name of the person to send greeting,
	 * 								 (optional) print to file or console by default console,
	 * 							     (optional) custom message followed by message from. 
	 * @param args
	 * add logging
	 * add junit test cases
	 * maven project
	 * args fname lname (file|console)? custom_msg? from?
	 * 
	 * log vailable for subclasses?
	 * set variables from methods?
	 */
	
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
	
	public void processArgs(String[] args){
		
		
			if (args.length < 2 || args.length > 5){
				//log.warn("USAGE: Greeting <firstname> <lastname> <file|console>? <custom message>? <msg from>?");
			}else if(args.length == 2){
				setFname(args[0]);
				setLname(args[1]);			
				//setPrintTo("");
				//log.info("fname ..." +getFname());
			}else if(args.length == 3){		
					setFname(args[0]);
					setLname(args[1]);
					setPrintTo(args[2]);
				
			}else if(args.length == 4){ 		
				setFname(args[0]);
				setLname(args[1]);
				setCustomMsg(args[2]);
				setMsgFrom(args[3]);			
			}else {
				setFname(args[0]);
				setLname(args[1]);
				setPrintTo(args[2]);
				setCustomMsg(args[3]);
				setMsgFrom(args[4]);
			}
		}
	

/**
 * 	
 * @param args
 */
	public static void main(String[] args) {
		//DOMConfigurator.configure("log4j.xml");
		GreetingProps g1 = new GreetingProps();
		
		if (args.length < 2 || args.length > 5){
			//log.warn("USAGE: Greeting <firstname> <lastname> <file|console>? <custom message>? <msg from>?");
		}else if(args.length == 2){
			g1.setFname(args[0]);
			g1.setLname(args[1]);			
			//setPrintTo("");
			//log.info("fname ..." +getFname());
		}else if(args.length == 3){		
			g1.setFname(args[0]);
			g1.setLname(args[1]);
			g1.setPrintTo(args[2]);
			
		}else if(args.length == 4){ 		
			g1.setFname(args[0]);
			g1.setLname(args[1]);
			g1.setCustomMsg(args[2]);
			g1.setMsgFrom(args[3]);			
		}else {
			g1.setFname(args[0]);
			g1.setLname(args[1]);
			g1.setPrintTo(args[2]);
			g1.setCustomMsg(args[3]);
			g1.setMsgFrom(args[4]);
		}
		g1.display();
		//g1.processArgs(args);
		
		System.out.println("fname: " +g1.getFname());
		System.out.println("lname:" +g1.getLname());
		System.out.println("cmsg:" +g1.getCustomMsg());
		System.out.println("msg_from:" +g1.getMsgFrom());
		System.out.println("print to:" +g1.getPrintTo());
		PrintGreeting pg = new PrintGreeting();
		
		pg.printGreetingTo(g1);
							
		
	}		
}


