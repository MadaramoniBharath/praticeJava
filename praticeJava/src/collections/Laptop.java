package collections;

public class Laptop implements Comparable<Laptop>{
	private String brand;
	private int price;
	private int ram;
	
	
	

	//parameterized constructer
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	//to string method
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.price > o.price) {
		return 1;
	}
		return -1;
		
	
	
}
}
	


