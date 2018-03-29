package com.ganli.thread04.demo1.ConditionTestMoreMethod.test;

import com.ganli.thread04.demo1.ConditionTestMoreMethod.service.MyService;
import com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread.ThreadA;
import com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread.ThreadAA;
import com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread.ThreadB;
import com.ganli.thread04.demo1.ConditionTestMoreMethod.extthread.ThreadBB;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadAA aa = new ThreadAA(service);
		aa.setName("AA");
		aa.start();

		Thread.sleep(100);

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		ThreadBB bb = new ThreadBB(service);
		bb.setName("BB");
		bb.start();

	}

}
