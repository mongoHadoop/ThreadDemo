package com.ganli.thread03.demo4.notifyOne.extthread;

import com.ganli.thread03.demo4.notifyOne.service.Service;

public class ThreadC extends Thread {
	private Object lock;

	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
