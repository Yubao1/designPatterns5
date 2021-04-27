package com.zhulu.test;

import java.util.ArrayList;
import java.util.List;


public class Send implements ISend{
    private int state = 0;
    private List<Reciever> list = new ArrayList<Reciever>();
    @Override
    public void setState(int state) {
    	this.state = state;
    }
    @Override
    public int getSate() {
    	return this.state;
    }
    @Override
    public void register(Reciever reciever) {
    	list.add(reciever);
    }
    @Override
    public void notifiAll(int i) {
    	for (Reciever reciever:list) {
    		reciever.update(i);
    	}
    }
}
