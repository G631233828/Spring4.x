package gjb.spring4.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.spring4.pojo.HelloWorld;

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
		
	}
	
	
}
