package com.banter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    @NotNull
    private String email;
}
