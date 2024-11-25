package org.example.servletdemo.model;

import lombok.Data;

@Data
public class Account {
    private int id;
    private int userId;
    private double balance;
}

