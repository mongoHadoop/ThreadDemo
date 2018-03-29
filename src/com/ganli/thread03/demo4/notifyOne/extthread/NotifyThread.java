package com.ganli.thread03.demo4.notifyOne.extthread;

import com.ganli.thread03.demo4.notifyOne.service.Service;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
		}
	}

}
