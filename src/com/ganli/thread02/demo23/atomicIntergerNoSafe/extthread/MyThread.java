package com.ganli.thread02.demo23.atomicIntergerNoSafe.extthread;

import com.ganli.thread02.demo23.atomicIntergerNoSafe.service.MyService;

public class MyThread extends Thread {
	private MyService mySerivce;

	public MyThread(MyService mySerivce) {
		super();
		this.mySerivce = mySerivce;
	}

	@Override
	public void run() {
		mySerivce.addNum();
	}

}
