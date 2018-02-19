package com.banter.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "institution_id")
    private Institution institution;

    @NotNull
    private String name;

    @NotNull
    private String plaid_id;

    @NotNull
    private BigDecimal available_balance;

    @NotNull
    private BigDecimal current_balance;

    @NotNull
    private String type; //TODO: It would be better to use some sort of enum here so I could have a fixed set of account types
}
