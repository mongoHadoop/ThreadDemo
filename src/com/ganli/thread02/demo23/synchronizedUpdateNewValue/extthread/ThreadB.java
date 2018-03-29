package com.ganli.thread02.demo23.synchronizedUpdateNewValue.extthread;

import com.ganli.thread02.demo23.synchronizedUpdateNewValue. service.Service;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.stopMethod();
	}

}
