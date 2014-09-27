package thirdHomework;

public class Product implements Comparable<Product> {

	private String name;
	private double price;
	private double quantity;


	protected Product() {
		super();
	}

	protected Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	protected double productOrder (String productName, double quantity) {
		double overallOrder = this.price * quantity;
		return overallOrder;
	}
	

	@Override
	public int compareTo(Product product) {
		double price = product.getPrice();
		if (this.price > price) {
			return 1;
		} else if (this.price == price) {
			return 0;
		} else {
			return -1;
		}
	}

}