package com.example.projet02.entities;

import com.example.projet02.entities.utils.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Lecture extends BaseEntity {

    private String name;
    @OneToOne(mappedBy ="lecture",cascade = CascadeType.ALL)
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "section_id",nullable = false)
    @JsonBackReference
    private Section section;

}
