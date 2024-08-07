package com.pranay.springExample1.demo;

import com.pranay.springExample1.demo.bean.Programmer;
import com.pranay.springExample1.demo.bean.Student;
import com.pranay.springExample1.demo.bean.SuperHero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World");
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Student student = (Student) context.getBean("studentBean");
		System.out.println(student);

		Programmer programmer = (Programmer) context.getBean("pranay");
		System.out.println(programmer);

		Programmer programmer1 = (Programmer) context.getBean("pranayBabu");
		System.out.println(programmer1);

		Programmer programmer2 = (Programmer)context.getBean("pranayBua");
		System.out.println(programmer2);

		SuperHero batman = (SuperHero) context.getBean("batman");
		System.out.println(batman);
	}
}
