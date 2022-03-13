package com.developer.leonardo.hrpayroll.resource;

import com.developer.leonardo.hrpayroll.entity.Payment;
import com.developer.leonardo.hrpayroll.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;

	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable(name = "workerId") Long workerId, @PathVariable(name = "days") Integer days) {
		Payment payment = paymentService.getPayment(workerId, days);
		return ResponseEntity.status(HttpStatus.OK).body(payment);
	}

}
