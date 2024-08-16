package com.example.projet02.entities;

import com.example.projet02.entities.utils.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 10,name = "Resource_type")
@EqualsAndHashCode(callSuper = true)
public class Resource extends BaseEntity {

    private String name;
    private Long size;
    private String url;
    @OneToOne
    @JoinColumn(name = "lecture_id",nullable = false)
    private Lecture lecture;

}
