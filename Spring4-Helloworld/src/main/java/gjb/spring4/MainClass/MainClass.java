package gjb.spring4.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.spring4.pojo.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		
		//��ʹ��spring��������������
//		HelloWorld hello = new HelloWorld();
//		hello.setMessage("helloworld");
//		hello.I_Say();
		
		
		//ʹ��spring�������д���
		//1.����IOC����������
		//ClassPathXmlApplicationContext ����Դ�л�ȡ
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hello = (HelloWorld) app.getBean("helloworld");
		hello.I_Say();
		
	}
	
	
}
