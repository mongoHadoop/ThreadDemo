package com.ganli.thread03.demo8.p_r_allWait.extthread;

import com.ganli.thread03.demo8.p_r_allWait.entity.P;

public class ThreadP extends Thread {

	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}

}
