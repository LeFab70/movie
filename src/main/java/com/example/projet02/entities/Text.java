package com.example.projet02.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Text")
public class Text extends Resource{
    private String content;
}
