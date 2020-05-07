package com.cognizant.abstractFactory;

public class ElectronicOrder extends Order {

	public ElectronicOrder(ChannelType channel, ProductType productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {

		System.out.println("Processing Order:::");
		System.out.println("Product Type : " + productType);
		System.out.println("Channel Type : " + channel);
	}

}