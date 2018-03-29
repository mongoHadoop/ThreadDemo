package com.ganli.thread02.demo23.synchronizedUpdateNewValue.extthread;

import com.ganli.thread02.demo23.synchronizedUpdateNewValue.service.Service;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}
}
