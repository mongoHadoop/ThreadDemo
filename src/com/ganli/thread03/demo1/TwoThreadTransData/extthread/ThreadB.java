package com.ganli.thread03.demo1.TwoThreadTransData.extthread;

import com.ganli.thread03.demo1.TwoThreadTransData.mylist.MyList;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName());
			synchronized (list) {
				try {
					System.out.println("list.size()  = "+list.size());
					if(list.size()!=5){
						    System.out.println("三生三世  list.size()  = "+list.size());
						    list.wait();//释放了锁
						    System.out.println("ThreadB 我知道了 list=5 我被唤醒了 ");
							throw new InterruptedException();
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("ThreadB 完毕 ");
	}

}
