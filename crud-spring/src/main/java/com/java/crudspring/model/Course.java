package com.java.crudspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

@Entity(name = "Course")
@Table(name = "course")
@Data
@EqualsAndHashCode(of = "id")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Length(max = 200)
    @Column(nullable = false, length = 200)
    private String name;

    @NotBlank
    @Length(max = 20)
    @Column(nullable = false, length = 20)
    private String category;

}
