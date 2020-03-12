package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Section;
import dmacc.beans.Student;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.StudentRepository;

@SpringBootApplication
public class StudentListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentListApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Student s = appContext.getBean("student", Student.class);
		
		System.out.println(s.toString());
	}
	
	@Autowired
	StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Using an existing bean
		Student s = appContext.getBean("student", Student.class);
		s.setGPA(3.9);
		repo.save(s);
		
		// Creating a bean to use - not managed by Spring
		Student b = new Student("Ashley Smith", "Liberal Arts", 3.5);
		Section c = new Section("Music Appreciation", 154);
		b.setSection(c);
		repo.save(b);
		
		List<Student> allMyStudents = repo.findAll();
		for(Student people: allMyStudents) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
