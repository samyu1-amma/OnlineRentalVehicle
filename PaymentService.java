package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Booking;
import com.cg.entity.Payment;
import com.cg.entity.Vehicle;
import com.cg.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository ;
	
	
	public String addPayment(Payment payment)
	{
		paymentRepository.save(payment);
		return"payment added succesfully";
		
	}
	public String cancelPayment(Payment p) {
		int id=p.getPaymentId();
		paymentRepository.deleteById(id);
		return"payment cancel sucessfully";
	}
	
	public Payment updatePayment(int id) {
		Payment p=paymentRepository.findById(id).get();
		p.setPaymentId(id);
		paymentRepository.flush();
		return p;
	}
	
	   public Payment viewpayment( int id ) {
		return  paymentRepository.findById(id).get();
		 
	}
	
	public List<Payment> viewAllPayments (){
		return paymentRepository.findAll();
		
	}

		
	}

	
	
	

	

