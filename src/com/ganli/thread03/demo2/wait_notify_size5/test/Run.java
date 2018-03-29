package com.ganli.thread03.demo2.wait_notify_size5.test;

import com.ganli.thread03.demo2.wait_notify_size5.extthread.ThreadA;
import com.ganli.thread03.demo2.wait_notify_size5.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(50);

			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
