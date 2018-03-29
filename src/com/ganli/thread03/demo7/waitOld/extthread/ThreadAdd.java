package com.ganli.thread03.demo7.waitOld.extthread;

import com.ganli.thread03.demo7.waitOld.entity.Add;

public class ThreadAdd extends Thread {

	private Add p;

	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.add();
	}

}
