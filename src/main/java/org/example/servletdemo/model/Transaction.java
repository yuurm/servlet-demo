package org.example.servletdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private int id;
    private int accountId;
    private double amount;
    private Date date;
}
