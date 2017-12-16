package com.progressoft.tests.training.paymentsapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentsController {

    private PaymentRepository paymentRepository;

    public PaymentsController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @RequestMapping("payments/byId")
    public Payment getPaymentById(@RequestParam Long id){
        return paymentRepository.findOne(id);
    }

    @RequestMapping("payments/byAccount")
    public List<Payment> getPaymentById(@RequestParam(name = "account") String accountNumber){
        return paymentRepository.getPaymentsByAccount(accountNumber);
    }
}
