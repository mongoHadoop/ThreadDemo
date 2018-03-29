package com.ganli.thread03.demo2.waitReleaseLock.service;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()"+Thread.currentThread().getName());
				lock.wait();
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
