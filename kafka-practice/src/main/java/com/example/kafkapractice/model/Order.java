package com.example.kafkapractice.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNo;
    private String orderDate;
    
    private String orderLines;
    
    private double totalDiscount;
    
    private double orderPrice;
    
    public String getOrderNo() {
        return orderNo;
    }
    
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
    public String getOrderDate() {
        return orderDate;
    }
    
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    public String getOrderLines() {
        return orderLines;
    }
    
    public void setOrderLines(String orderLines) {
        this.orderLines = orderLines;
    }
    
    public double getTotalDiscount() {
        return totalDiscount;
    }
    
    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
    
    public double getOrderPrice() {
        return orderPrice;
    }
    
    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
    
    @Override
    public String toString() {
        return "Order{" +
            "orderNo='" + orderNo + '\'' +
            ", orderDate='" + orderDate + '\'' +
            ", orderLines='" + orderLines + '\'' +
            ", totalDiscount=" + totalDiscount +
            ", orderPrice=" + orderPrice +
            '}';
    }
    
}
