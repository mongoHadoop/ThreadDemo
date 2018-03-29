package com.ganli.thread03.demo8.p_r_allWait.extthread;

import com.ganli.thread03.demo8.p_r_allWait.entity.C;

public class ThreadC extends Thread {

	private C r;

	public ThreadC(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.getValue();
		}
	}

}
