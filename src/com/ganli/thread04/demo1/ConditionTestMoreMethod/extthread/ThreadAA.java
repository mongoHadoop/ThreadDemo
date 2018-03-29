package com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread;

import com.ganli.thread04.demo1.ConditionTestMoreMethod.service.MyService;

public class ThreadAA extends Thread {

	private MyService service;

	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}
