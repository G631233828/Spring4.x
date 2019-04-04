package gjb.spring4.pojo;

import java.util.List;

public class Clazz {

	private String clazzName;

	private List<Human> humans;

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public List<Human> getHumans() {
		return humans;
	}

	public void setHumans(List<Human> humans) {
		this.humans = humans;
	}

	public Clazz(String clazzName, List<Human> humans) {
		this.clazzName = clazzName;
		this.humans = humans;
	}

	public Clazz() {
	}

	@Override
	public String toString() {
		return "Clazz [clazzName=" + clazzName + ", humans=" + humans + "]";
	}

}
