package com.example.projet02.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(mappedBy ="lecture",cascade = CascadeType.ALL)
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "section_id",nullable = false)
    @JsonBackReference
    private Section section;

}
