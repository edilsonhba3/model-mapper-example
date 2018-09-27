package app.main;

public class OrderInfo {
	private String customerName;
	private String streetAddress;

	private String other;

	public OrderInfo() {
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "OrderInfo [customerName=" + customerName + ", streetAddress=" + streetAddress + ", other=" + other
				+ "]";
	}

}
