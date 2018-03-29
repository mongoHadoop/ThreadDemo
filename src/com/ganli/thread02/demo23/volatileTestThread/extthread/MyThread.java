package com.ganli.thread02.demo23.volatileTestThread.extthread;
/**
 * 在 本 示例 的 意图 中， 如果 在 方法 private static void addCount（） 
 * 前 加入 synchronized 同步 关键字，
 *  也就 没有 必要 再 使用 volatile 关键字 来 声明 count 变量 了。 
 *  关键字 volatile 主要 使用 的 场合 是在 多个 线程 中 
 *  可以 感知 实例 变量 被 更改 了， 
 *  并且 可以 获得 最 新的 值 使用，
 *   也就是 用 多 线程 读取 共享 变量 时 可以 获得 最新 值 使用。
关键字 volatile 提示 线程 每次 从 共享 内存 中 读取 变量， 
而 不是 从 私有 内存 中 读取， 就 保证 了 同步 数据 的 可见 性。
 但在 这里 需要 注意 的 是： 如果 修改 实例 变量 中的 数据，
  比如 i++， 也就是 i= i+ 1， 则 这样 的 操作 其实 并不是 一个 原子 操作， 
  也就 是非 线程 安全 的。 表达式 i++ 的 操作步骤 分解 如下：
 * @author mongo
 *
 */
public class MyThread extends Thread {
	public static int count;

	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}
