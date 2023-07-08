package com.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s1 = (Samosa)con.getBean("s1");
//		System.out.println(s1);     
		con.registerShutdownHook();
//		
//		Pepsi pep =(Pepsi) con.getBean("pep");
//		System.out.println(pep);
		
		Example ex =(Example) con.getBean("ex");
		System.out.println(ex);
	}
}
