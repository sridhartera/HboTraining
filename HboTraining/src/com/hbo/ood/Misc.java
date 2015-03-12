package com.hbo.ood;

public class Misc {

	/**
	 * @param args
	 */
	public void test() {
		GreetingProps gp = new GreetingProps();
		System.out.println(gp.getFname());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Misc m = new Misc();
		m.test();
		GreetingProps gp = new GreetingProps();
		System.out.println("misc:" +gp.getFname());
	}

}
