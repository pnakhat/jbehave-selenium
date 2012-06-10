package org.qagile.support;

import junit.framework.Assert;

import org.qagile.conditions.Condition;



public class Timer {

	private long timeout;
	private long currenttime;

	public Timer(long timeout) {
		this.timeout = timeout;
		this.currenttime = System.currentTimeMillis();
	}

	public void waitUntil(Condition condition) {
		while (System.currentTimeMillis() < currenttime + timeout) {
			if (condition.isSatisfied()) {
				return;
			} else {
				waitAbit(500);
				System.out.println("waiting a bit...." + condition.describe());
			}
			Assert.fail("Could not satisfy the condition: " + condition.describe());
		}

	}

	private void waitAbit(long wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
