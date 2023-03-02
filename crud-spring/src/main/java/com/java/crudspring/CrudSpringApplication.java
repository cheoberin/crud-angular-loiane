package com.java.crudspring;

import com.java.crudspring.model.Course;
import com.java.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository) {

        return args -> {
            courseRepository.deleteAll();

            Course course1 = new Course();
            course1.setName("Angular com Spring");
            course1.setCategory("front-end");

            Course course2 = new Course();
            course2.setName("Github");
            course2.setCategory("dev-ops");

            Course course3 = new Course();
            course3.setName("Spring com Angular");
            course3.setCategory("back-end");

            courseRepository.saveAll(List.of(course1, course2, course3));
        };

    }


}
