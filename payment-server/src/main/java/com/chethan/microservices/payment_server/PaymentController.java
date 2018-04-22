package com.chethan.microservices.payment_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payments")
public class PaymentController {

	@GetMapping("/message")
	public String showMessage() {
		return "Message from Payment Controller";
	}
}
