package com.progressoft.tests.training.paymentsapp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue
    private Long id;
    private String account;
}
