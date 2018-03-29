package com.ganli.thread02.demo23.atomicIntergerNoSafe.test.run;

import com.ganli.thread02.demo23.atomicIntergerNoSafe.service.MyService;
import com.ganli.thread02.demo23.atomicIntergerNoSafe.extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();

			MyThread[] array = new MyThread[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
