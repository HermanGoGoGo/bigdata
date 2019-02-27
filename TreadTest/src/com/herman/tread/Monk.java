package com.herman.tread;

import java.util.Random;

public class Monk extends Thread {
	private int count;
	private String name;

	private Bok bok;

	public static int MAX = 5;

	public Monk(String name, Bok bok) {
		this.bok = bok;
		this.name = name;
	}

	@Override
	public void run() {
		while (true) {
			int n = bok.getMantou(this);
			try {
				sleep(new Random().nextInt(5));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (n == 0) {
				return;
			} else {
				count++;
			}
		}
	}

	public int getCount() {
		return count;
	}

}
