package com.bt.billing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {
    private @Id @GeneratedValue Long Id;
    private String name;
    private double amount;

    public Bill() {
    }

    public Bill(Long Id, String name, double amount){
        this.Id = Id;
        this.name = name;
        this.amount = amount;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
