package com.example.projet02.entities;

import com.example.projet02.entities.utils.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Author extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_course",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
