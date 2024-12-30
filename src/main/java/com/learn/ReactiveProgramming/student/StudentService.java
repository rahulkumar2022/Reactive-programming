package com.learn.ReactiveProgramming.student;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Mono<Student> save(Student student){
        return studentRepository.save(student);
    }

    public Flux<Student> findAll(){
        return studentRepository.findAll()
        .delayElements(Duration.ofMillis(100));
    }

    public Mono<Student> findById(Integer id){
        return studentRepository.findById(Long.valueOf(id));
    }
}
