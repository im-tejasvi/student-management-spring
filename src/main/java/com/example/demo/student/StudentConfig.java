package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student imtej = new Student(
                    "Tejasvi Sharma",
                    "imtejasvi@gmail.com",
                    LocalDate.of(1997, Month.NOVEMBER, 28),
                    23
            );
            Student imtejasvi = new Student(
                    "Tejasvi Sharma",
                    "imtejasvis@gmail.com",
                    LocalDate.of(1997, Month.NOVEMBER, 28),
                    23
            );
            repository.saveAll(
                    List.of(imtej, imtejasvi)
            );
        };
    }
}
