package com.ganli.thread03.demo4.notifyOne.extthread;

import com.ganli.thread03.demo4.notifyOne.service.Service;

public class ThreadA extends Thread {
	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
