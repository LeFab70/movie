package com.example.projet02.entities.utils;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false,nullable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private LocalDateTime lastUpdatedAt;
    @Column(nullable = false,insertable = false)
    private String createdBy;
    @Column(nullable = false)
    private String lastUpdatedBy;
}
