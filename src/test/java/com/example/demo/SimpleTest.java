package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;


public class SimpleTest {
	
	@Test
	public void test1() throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(100l);
//			executorService.execute(new MyThread("thread"+i));
			Future<?> submit = executorService.submit(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(System.currentTimeMillis());
				}
			});
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                			
		}
		executorService.shutdown();
	}

}

class MyThread extends Thread{
	private String myname;
	

	public MyThread(String myname) {
		super();
		this.myname = myname;
	}


	public String getMyname() {
		return myname;
	}


	public void setMyname(String myname) {
		this.myname = myname;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(myname+"-"+i+System.currentTimeMillis());
		}
	}
}
