package com.learn.ReactiveProgramming;

import com.learn.ReactiveProgramming.student.Student;
import com.learn.ReactiveProgramming.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveApppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService studentService){
		return args -> {
			for(int i=0;i<100;i++){
				studentService.save(Student.builder()
						.firstName("Rahul "+i)
						.lastName("Test "+i)
						.age(i).build()).subscribe();
			}
		};
	}

}
