package app.main;

public class Order {
	private Customer customer;
	private Address address;
	private String lista;

	public Order() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", address=" + address + ", lista=" + lista + "]";
	}

}
