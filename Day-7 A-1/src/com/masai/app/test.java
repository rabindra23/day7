package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		System.out.println("Application is working");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		



		Contact contact=(Contact)context.getBean("contact");
		System.out.println(contact);
		System.out.println("..........................................");
		
		RateInfo rateInfo=context.getBean(RateInfo.class,"rate-info");
		System.out.println(rateInfo);
		System.out.println("........................................");
		
		Customer customer=(Customer)context.getBean("customer");
		System.out.println(customer);
		System.out.println(customer.getmCustomerContact());
		System.out.println("..........................................");
		
		RateUpdateDetails rateUpdateDetails=(RateUpdateDetails)context.getBean("rate-update-details");
		System.out.println(rateUpdateDetails);
		System.out.println("...........................................");
		
		SenderInfo senderInfo=(SenderInfo)context.getBean("sender-info");
		System.out.println(senderInfo);
		System.out.println("...........................................");
		

		
		RateUpdate rateUpdate=(RateUpdate)context.getBean("rate-update");
		System.out.println(rateUpdate);
		System.out.println(rateUpdate.getmUpdateDetails().toString());
		
		
		

	}

}
