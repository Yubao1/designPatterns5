package com.zhulu.test;

public interface ISend {
	public void register(Reciever reciever);
	public void notifiAll(int i);
	public void setState(int state);
    public int getSate();
}
