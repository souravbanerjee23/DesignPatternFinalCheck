package com.cognizant.observerPattern;

public class Admin extends INotificationObserver {

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		System.out.println("Hello " + name + " .");
		System.out.println("Please pay attention...Your event will start soon.");
	}
}