package com.ganli.thread03.demo2.test2.test;

import com.ganli.thread03.demo2.test2.extthread.MyThread1;
import com.ganli.thread03.demo2.test2.extthread.MyThread2;

public class Test {
	public static void main(String[] args) {
		try {
			Object lock = new Object();

			MyThread1 t1 = new MyThread1(lock);
			t1.start();

			Thread.sleep(3000);

			MyThread2 t2 = new MyThread2(lock);
			t2.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
