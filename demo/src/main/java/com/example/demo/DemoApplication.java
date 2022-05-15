package com.example.demo;

import com.example.demo.interfaces.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import student.Address;
import student.Student;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address("israel", "tel-aviv", "alenbi 110");
			Student student = new Student(
					"Itay",
					"Goldman",
					"itaym178@gmail.com",
					LocalDateTime.now()
			);

			repository.insert(student);
		};
	}

}
