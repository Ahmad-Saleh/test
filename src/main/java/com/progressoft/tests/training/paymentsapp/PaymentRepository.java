package com.progressoft.tests.training.paymentsapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

    List<Payment> getPaymentsByAccount(String account);
}
