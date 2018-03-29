package com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread;

import com.ganli.thread04.demo1.ConditionTestMoreMethod.service.MyService;

public class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
