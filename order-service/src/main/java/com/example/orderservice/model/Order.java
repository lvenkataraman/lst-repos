package com.example.orderservice.model;

import java.time.LocalDate;

public class Order {
    private String orderNumber;
    private LocalDate orderDate;
    private String[] orderItems;
    private Integer[] orderQuantity;
    private String customerName;
    private String customerAddress1;
    private String customerAddress2;
    private String customerAddressCity;
    private String customerAddressState;
    private String customerAddressCountry;
    private String customerAddressZipCode;

    public Order() {
    }

    public Order(String orderNumber, LocalDate orderDate, String[] orderItems,
                 Integer[] orderQuantity, String customerName, String customerAddress1,
                 String customerAddress2, String customerAddressCity,
                 String customerAddressState, String customerAddressCountry,
                 String customerAddressZipCode) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.orderQuantity = orderQuantity;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerAddress2 = customerAddress2;
        this.customerAddressCity = customerAddressCity;
        this.customerAddressState = customerAddressState;
        this.customerAddressCountry = customerAddressCountry;
        this.customerAddressZipCode = customerAddressZipCode;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String[] orderItems) {
        this.orderItems = orderItems;
    }

    public Integer[] getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer[] orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public String getCustomerAddressCity() {
        return customerAddressCity;
    }

    public void setCustomerAddressCity(String customerAddressCity) {
        this.customerAddressCity = customerAddressCity;
    }

    public String getCustomerAddressState() {
        return customerAddressState;
    }

    public void setCustomerAddressState(String customerAddressState) {
        this.customerAddressState = customerAddressState;
    }

    public String getCustomerAddressCountry() {
        return customerAddressCountry;
    }

    public void setCustomerAddressCountry(String customerAddressCountry) {
        this.customerAddressCountry = customerAddressCountry;
    }

    public String getCustomerAddressZipCode() {
        return customerAddressZipCode;
    }

    public void setCustomerAddressZipCode(String customerAddressZipCode) {
        this.customerAddressZipCode = customerAddressZipCode;
    }
}
