package com.rbu.util;

import org.springframework.stereotype.Component;

@Component
public class NotificationEmail {
	
	public NotificationEmail() {
	System.out.println("NotificationEmail object create:@Component-4");
	}

	public void sendEmail() {
	System.out.println("sending email");
		
	}

}
