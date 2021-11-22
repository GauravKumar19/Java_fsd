package com.cust.shop;

public class Customer {
    private int custid;
    private String custname;
    private int orderid;
    private String prname; 
    public int getCustid() {
        return custid;
    }
    public void setCustid(int custid) {
        this.custid = custid;
    }
    public String getCustname() {
        return custname;
    }
    public void setCustname(String custname) {
        this.custname = custname;
    }
    public int getOrderid() {
        return orderid;
    }
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    public String getPrname() {
        return prname;
    }
    public void setPrname(String prname) {
        this.prname = prname;
    }

}