package com.ganli.thread03.demo8.p_r_test.test;

import com.ganli.thread03.demo8.p_r_test.entity.P;
import com.ganli.thread03.demo8.p_r_test.entity.C;
import com.ganli.thread03.demo8.p_r_test.extthread.ThreadP;
import com.ganli.thread03.demo8.p_r_test.extthread.ThreadC;

public class Run {

	public static void main(String[] args) {

		String lock = new String("A");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
