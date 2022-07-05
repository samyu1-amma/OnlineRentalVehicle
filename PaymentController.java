package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Payment;
import com.cg.repository.PaymentRepository;
import com.cg.service.PaymentService;


@RestController
public class PaymentController {
	
	@Autowired
	public PaymentService paymentService;
	
	@GetMapping("/addPayment/{payment}")
	public String addPayment(@RequestBody Payment payment) {
		return paymentService.addPayment(payment);
	}
	
	@PutMapping("/update/{paymentId}")
	public Payment updatePayment(@PathVariable("paymentId")int paymentId){
		return paymentService.updatePayment(paymentId);
	}
	@DeleteMapping("/deletePayment/{paymentId}")
	public List<Payment> deletePayment(@PathVariable("PaymentId")int paymentId){
		return paymentService.cancelPayment(paymentId);
	
	}
	@GetMapping("/ViewPayment/paymentId")
	public Payment viewPayment(@PathVariable("paymentId")int paymentId) {
		return paymentService.viewpayment(paymentId);
	}
   @GetMapping("/ViewAllPaments/")
   public List<Payment> ViewAllCustomer(){
	   return paymentService.viewAllPayments();
   }
   

}
