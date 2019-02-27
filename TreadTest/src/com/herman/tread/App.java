package com.herman.tread;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bok bok =new Bok();
		for (int i = 0; i < 30; i++) {
			new Monk("Monk" + i, bok).start();
		}
	}

}
