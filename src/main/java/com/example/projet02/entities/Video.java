package com.example.projet02.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Video")
public class Video extends Resource{
    private Long length;
}
