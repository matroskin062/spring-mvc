package com.mvc.spring.springmvclab.Entities;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public BankAccount() {
    }

    public BankAccount(double amount, Client client) {
       this.amount = amount;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}