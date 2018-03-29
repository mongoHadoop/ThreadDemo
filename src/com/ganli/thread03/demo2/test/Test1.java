package com.ganli.thread03.demo2.test;

public class Test1 {
	/**
	 * 出现 异常 的 原因 是 没有“ 对象 监视器”， 也就是 没有 同步 加锁。
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
