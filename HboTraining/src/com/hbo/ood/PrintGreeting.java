package com.hbo.ood;

import java.io.FileWriter;
import java.io.IOException;

public class PrintGreeting {
	GreetingProps g2;
	public void printGreetingTo(GreetingProps gp2){
		g2 = new GreetingProps();
		this.g2 = gp2;		
		CustomMessage cmsg = new CustomMessage();
		String printTo = g2.getPrintTo();
		System.out.println("print to000:" +printTo);
		if (printTo != "file"){
			printTo = "console";
			cmsg.printGreeting();
			String pmsg = cmsg.getGreetMsg();
				System.out.println(pmsg);
		}else {
			try {
				cmsg.printCustomGreeting();
				String pmsg = cmsg.getGreetMsg();
				
				FileWriter fw = new FileWriter("greeting.txt");
				
				fw.write(pmsg);
				fw.flush();
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
}
