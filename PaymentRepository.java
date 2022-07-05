package com.cg.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Booking;
import com.cg.entity.Payment;
import com.cg.entity.Vehicle;


public interface PaymentRepository extends JpaRepository <Payment , Integer>{
	
	public Booking addPayment(Payment payment);
	public Booking cancelPayment(Payment p);
	public Booking viewPayment(Booking b);
	public List <Booking> viewAllPayments(Vehicle vehicle);
	public double calculateMonthlyRevenue(LocalDate d1,LocalDate d2);
	public double calculateTotalPayment(Vehicle v);
	
    
}
