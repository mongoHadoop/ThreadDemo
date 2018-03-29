package com.ganli.thread03.demo2.waitReleaseLock.test;

import com.ganli.thread03.demo2.waitReleaseLock.extthread.ThreadA;
import com.ganli.thread03.demo2.waitReleaseLock.extthread.ThreadB;

public class Test {

	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

	}

}
