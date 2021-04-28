package com.zhulu.test;
/**
 * 测试观察者模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        ISend send = new Send();
        Reciever recieverA = new ReceiverA("A");
        Reciever recieverB = new ReceiverB("B");
        Reciever recieverC = new ReceiverC("C");
        send.register(recieverA);
        send.register(recieverC);
        send.register(recieverB);
        send.setState(999);
        send.notifiAll(send.getSate());
        System.out.println(recieverA);
        System.out.println(recieverB);
        System.out.println(recieverC);
	}

}
