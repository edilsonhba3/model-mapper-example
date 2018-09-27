package app.main;

import org.modelmapper.ModelMapper;

public class App {

	public static void main(String[] args) {

		ModelMapper modelMapper = new ModelMapper();

		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setCustomerName("customer");
		orderInfo.setStreetAddress("streetAddress");
		orderInfo.setOther("other");
		
		Order order = modelMapper.map(orderInfo, Order.class);

		System.out.println(order);
		System.out.println(orderInfo);
		
		
	}

}
