package com.ganli.thread03.demo2.waitReleaseLock.extthread;

import com.ganli.thread03.demo2.waitReleaseLock.service.Service;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
