package com.ganli.thread03.demo2.notifyHoldLock.test;

import com.ganli.thread03.demo2.notifyHoldLock.extthread.NotifyThread;
import com.ganli.thread03.demo2.notifyHoldLock.extthread.ThreadA;
import com.ganli.thread03.demo2.notifyHoldLock.extthread.synNotifyMethodThread;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.start();

	}

}
