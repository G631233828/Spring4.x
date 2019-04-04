package gjb.spel.pojo;

public class Address {

	private String address;
	private Double area;
	private Double price;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", area=" + area + ", price=" + price + "]";
	}

}
