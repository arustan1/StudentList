package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Section;
import dmacc.beans.Student;

@Configuration
public class BeanConfiguration {
	@Bean
	public Student student() {
		Student bean = new Student();
//		bean.setName("Alicia Rustan");
//		bean.setMajor("Computer Information Systems");
//		bean.setGPA(3.8);
		return bean;
	}
	
	@Bean
	public Section section() {
		Section bean = new Section("Java II", 123);
		return bean;
	}

}
