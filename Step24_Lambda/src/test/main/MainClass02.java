﻿package test.main;
import test.mypac.PrintMsg;

public class MainClass02 {
	public static void main(String[] args) {
		usePrint(new PrintMsg() {
			
			@Override
			public void print(String msg) {
				System.out.println("출력: " + msg);
				
			}
		});
		
		//인터페이스에 정의된 메소드가 하나여야 한다는 전제가 있음.
		usePrint((msg)->{
			System.out.println("출력2: " + msg);
		});
	}
	
	public static void usePrint(PrintMsg p) {
		p.print("hello");
	}
}
