package com.ganli.thread03.demo3.waitInterruptException.test;

import com.ganli.thread03.demo3.waitInterruptException.extthread.ThreadA;

public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
