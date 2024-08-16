package com.example.projet02.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
