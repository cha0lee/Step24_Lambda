package test.main;

import javax.xml.stream.events.StartDocument;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("스레드에서 A작업 수행");
				
			}
		}).start();
		
		new Thread(()->{
			System.out.println("test!");
		}).start();
	}
	
}
