package com.progressoft.tests.training.paymentsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaymentsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsAppApplication.class, args);
	}

	@Bean
	CommandLineRunner insertData(PaymentRepository repository){
		return args -> {
            repository.save(createPayment("123"));
			repository.save(createPayment("123"));
			repository.save(createPayment("123"));
			repository.save(createPayment("123"));
			repository.save(createPayment("123"));
			repository.save(createPayment("123"));
            repository.save(createPayment("321"));
            repository.save(createPayment("111"));
            repository.save(createPayment("222"));
            repository.save(createPayment("333"));
        };
	}

	private Payment createPayment(String account) {
		Payment payment = new Payment();
		payment.setAccount(account);
		return payment;
	}

	@Bean
	CommandLineRunner listData(PaymentRepository repository){
		return args -> repository.findAll().forEach(System.out::println);
	}
}
