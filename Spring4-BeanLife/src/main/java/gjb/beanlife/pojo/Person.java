package gjb.beanlife.pojo;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void init(){
		System.out.println("bean ³õÊ¼»¯");
	}

	
	public void destory(){
		System.out.println("bean Ïú»Ù");
	}


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
