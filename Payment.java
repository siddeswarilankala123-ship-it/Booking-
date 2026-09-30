package com.functionhall.model;
public class Payment {
 private int paymentId,bookingId; private double amount; private String paymentMethod,transactionId,paymentStatus;
 public int getPaymentId(){return paymentId;} public void setPaymentId(int v){paymentId=v;}
 public int getBookingId(){return bookingId;} public void setBookingId(int v){bookingId=v;}
 public double getAmount(){return amount;} public void setAmount(double v){amount=v;}
 public String getPaymentMethod(){return paymentMethod;} public void setPaymentMethod(String v){paymentMethod=v;}
 public String getTransactionId(){return transactionId;} public void setTransactionId(String v){transactionId=v;}
 public String getPaymentStatus(){return paymentStatus;} public void setPaymentStatus(String v){paymentStatus=v;}
}
