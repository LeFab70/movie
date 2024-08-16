package com.example.projet02.entities;

import com.example.projet02.entities.utils.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode( callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
public class Course extends BaseEntity {

    private String title;
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<Section> sections;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Author> authors;
}
