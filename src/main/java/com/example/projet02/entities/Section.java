package com.example.projet02.entities;

import com.example.projet02.entities.utils.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Section extends BaseEntity {

    private String name;
    private Long order;
    @OneToMany(mappedBy = "section",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Lecture> lectures;

    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false)
    @JsonBackReference
    private Course course;

}
