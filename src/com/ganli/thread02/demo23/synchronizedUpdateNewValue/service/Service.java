package com.ganli.thread02.demo23.synchronizedUpdateNewValue.service;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContinueRun == true) {
			synchronized (anyString) {
			}
		}
		System.out.println("ͣ�����ˣ�");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
