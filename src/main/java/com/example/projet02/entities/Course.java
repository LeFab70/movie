package com.example.projet02.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<Section> sections;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Author> authors;
}
