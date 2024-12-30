package com.learn.ReactiveProgramming.student;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="students")
public class Student {
    @Id
    private Integer id;
    @Column("firstname")
    private String firstName;
    @Column("lastname")
    private String lastName;
    private Integer age;

}
