package com.developer.leonardo.hrpayroll.service;

import com.developer.leonardo.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days){
		return new Payment("Leonardo", new BigDecimal("102.10"), days);
	}

}
