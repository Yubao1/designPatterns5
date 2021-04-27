package com.zhulu.test;

public class Context {
    private Price price;
    public Context(Price price) {
    	setPrice(price);
    }
    public void printPrice(double s) {
    	System.out.println("原价为：" + s);
    	System.out.println("打折后的价格为：" + price.getPrice(s));
    }
    
    public void setPrice(Price price) {
    	this.price = price;
    }
}
