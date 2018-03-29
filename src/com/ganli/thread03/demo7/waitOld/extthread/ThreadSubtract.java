package com.ganli.thread03.demo7.waitOld.extthread;

import com.ganli.thread03.demo7.waitOld.entity.Subtract;

public class ThreadSubtract extends Thread {

	private Subtract r;

	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		r.subtract();
	}

}
