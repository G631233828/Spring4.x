package gjb.spel.pojo;

public class Person {

	private String name;
	private int age;
	private Address address;
	private boolean marriage;
	private String socialStatus;
	
	

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public String getSocialStatus() {
		return socialStatus;
	}

	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", marriage=" + marriage
				+ ", socialStatus=" + socialStatus + "]";
	}

	
}
