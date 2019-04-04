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
		
//		//ͨ�����ͽ��з��ʣ�����ж��beanʹ��ͬһ�������ִ���
//		HelloWorld hello2 = app.getBean(HelloWorld.class);
//		hello2.I_Say();
//		
		
		Human hu = (Human) app.getBean("human");
		System.out.println(hu);
		System.out.println(hu.getHuman());
		//Human [name=fliay, age=21, address=�Ϻ�]
		
		//teacher��Ƕ����human
		Teacher teacher = (Teacher) app.getBean("teacher");
		System.out.println(teacher);
		
		//���ü�������
		Teacher teacher2 = (Teacher) app.getBean("teacher2");
		System.out.println("�������ԣ�"+teacher2);
		
		//list���� 
		Clazz clazz = (Clazz) app.getBean("clazz");
		System.out.println("list��������"+clazz);
		
		
		//����һ��properties
		DataSources sources = (DataSources) app.getBean("dataSource");
		System.out.println(sources.getProperties());
	}
	
	
}
