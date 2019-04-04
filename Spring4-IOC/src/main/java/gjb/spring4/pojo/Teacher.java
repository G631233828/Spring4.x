package gjb.spring4.pojo;

public class Teacher {
	
	private Human human;
	private String clazz;
	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public Teacher(Human human, String clazz) {
		this.human = human;
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Teacher [human=" + human + ", clazz=" + clazz + "]";
	}
	public Teacher() {
	}
	
	
	
	

}
