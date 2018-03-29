package com.ganli.thread03.demo1.TwoThreadTransData.test;

import com.ganli.thread03.demo1.TwoThreadTransData.mylist.MyList;
import com.ganli.thread03.demo1.TwoThreadTransData.extthread.ThreadA;
import com.ganli.thread03.demo1.TwoThreadTransData.extthread.ThreadB;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyList list = new MyList ();
		
		
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
		
	}

}
