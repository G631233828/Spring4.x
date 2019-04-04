package gjb.spring4.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.spring4.collection.DataSource.DataSources;
import gjb.spring4.pojo.Clazz;
import gjb.spring4.pojo.HelloWorld;
import gjb.spring4.pojo.Human;
import gjb.spring4.pojo.Teacher;

public class MainClass {

	public static void main(String[] args) {
		
		//不使用spring容器来创建对象
//		HelloWorld hello = new HelloWorld();
//		hello.setMessage("helloworld");
//		hello.I_Say();
		
		
		//使用spring容器进行创建
		//1.创建IOC的容器对象
		//ClassPathXmlApplicationContext 从资源中获取
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hello = (HelloWorld) app.getBean("helloworld");
		hello.I_Say();
		
//		//通过类型进行访问，如果有多个bean使用同一个类会出现错误
//		HelloWorld hello2 = app.getBean(HelloWorld.class);
//		hello2.I_Say();
//		
		
		Human hu = (Human) app.getBean("human");
		System.out.println(hu);
		System.out.println(hu.getHuman());
		//Human [name=fliay, age=21, address=上海]
		
		//teacher中嵌入了human
		Teacher teacher = (Teacher) app.getBean("teacher");
		System.out.println(teacher);
		
		//配置级联属性
		Teacher teacher2 = (Teacher) app.getBean("teacher2");
		System.out.println("级联属性："+teacher2);
		
		//list集合 
		Clazz clazz = (Clazz) app.getBean("clazz");
		System.out.println("list集合配置"+clazz);
		
		
		//配置一个properties
		DataSources sources = (DataSources) app.getBean("dataSource");
		System.out.println(sources.getProperties());
	}
	
	
}
