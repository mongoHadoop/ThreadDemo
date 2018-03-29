package com.ganli.thread03.demo8.p_r_allWait.test;

import com.ganli.thread03.demo8.p_r_allWait.entity.P;
import com.ganli.thread03.demo8.p_r_allWait.entity.C;
import com.ganli.thread03.demo8.p_r_allWait.extthread.ThreadP;
import com.ganli.thread03.demo8.p_r_allWait.extthread.ThreadC;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] rThread = new ThreadC[2];

		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));

			rThread[i] = new ThreadC(r);
			rThread[i].setName("消费者" + (i + 1));

			pThread[i].start();
			rThread[i].start();
		}

		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread()
				.getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);

		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}

}
