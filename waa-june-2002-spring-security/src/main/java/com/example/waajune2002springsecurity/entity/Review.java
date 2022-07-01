package com.example.waajune2002springsecurity.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private int numberOfStars;

    @ManyToOne
    private Product product;

}
