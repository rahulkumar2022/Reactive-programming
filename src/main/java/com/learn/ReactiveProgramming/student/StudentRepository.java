package com.learn.ReactiveProgramming.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {
    Flux<Student> findAllByFirstNameIgnoreCase(String firstName);
}