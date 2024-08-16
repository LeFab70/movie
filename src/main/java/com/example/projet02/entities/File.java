package com.example.projet02.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("File")
public class File extends Resource{
    private String type;
}
