package com.ganli.thread04.demo1.ReentrantLockTest.extthread;

import com.ganli.thread04.demo1.ReentrantLockTest.service.MyService;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
