package com.ganli.thread03.demo8.p_r_allWait_fix.extthread;

import com.ganli.thread03.demo8.p_r_allWait_fix.entity.C;

public class ThreadR extends Thread {

	private C r;

	public ThreadR(C r) {
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
