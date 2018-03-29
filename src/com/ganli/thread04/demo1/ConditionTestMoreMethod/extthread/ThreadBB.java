package com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread;

import com.ganli.thread04.demo1.ConditionTestMoreMethod.service.MyService;

public class ThreadBB extends Thread {

	private MyService service;

	public ThreadBB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
