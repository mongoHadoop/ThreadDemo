package com.ganli.thread03.demo1.TwoThreadTransData.extthread;

import com.ganli.thread03.demo1.TwoThreadTransData.mylist.MyList;
public class ThreadA extends Thread {

	private MyList list;

	public ThreadA( MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName());
			synchronized (list) {
				for (int i = 0; i < 10; i++) {
					list.add();
					if(list.size()==5){
						list.notifyAll();
					}
					System.out.println("添加了" + (i + 1) + "个元素");
				}
			}
			System.out.println("ThreadA over ");
	}

}