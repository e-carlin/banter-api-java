package com.banter.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String plaid_ins_id;

    @NotNull
    private String access_token;

    @NotNull
    private String item_id;
}
