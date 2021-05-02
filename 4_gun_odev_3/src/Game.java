
public class Game {
	private String name;
	private int price;
	private double priceAfterDiscount;
	
	public Game(String name, int price, double priceAfterDiscount) {
		this.name = name;
		this.price = price;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}

	
}
