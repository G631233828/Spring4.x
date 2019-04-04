package gjb.properties.test;

public class Person {

	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getPerson() {

		System.out.println("ĞÕÃû:" + name + "ÄêÁä£º" + age + "µØÖ·£º" + address);

	}

}
