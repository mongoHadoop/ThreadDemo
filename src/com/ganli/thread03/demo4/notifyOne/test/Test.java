package com.ganli.thread03.demo4.notifyOne.test;

import com.ganli.thread03.demo4.notifyOne.extthread.NotifyThread;
import com.ganli.thread03.demo4.notifyOne.extthread.ThreadA;
import com.ganli.thread03.demo4.notifyOne.extthread.ThreadB;
import com.ganli.thread03.demo4.notifyOne.extthread.ThreadC;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}

}
