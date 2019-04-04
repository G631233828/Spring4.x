package gjb.spring4.pojo;

public class Human {
	
	

	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Human(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public Human() {
	}

	
	public Human getHuman(){
		Human hu  = new Human();
		hu.setAddress(this.getAddress());
		hu.setAge(this.getAge());
		hu.setName(this.getName());
		return hu;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
