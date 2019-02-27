package com.herman.tread;

public class Bok {
	private int count = 100;
	
	
	public synchronized int getMantou(Monk monk){
		int mCount = monk.getCount();
		if(count == 0){
			System.out.println(monk.getName() + ":" + monk.getCount());
			return 0;
		}
		
		if(mCount == monk.MAX){
			System.out.println(monk.getName() + ":" + monk.getCount());
			return 0;
		}
		int currCount = count ;
		count -- ;
		if(count > 70){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			this.notifyAll();
		}
		return currCount;
	}
}
