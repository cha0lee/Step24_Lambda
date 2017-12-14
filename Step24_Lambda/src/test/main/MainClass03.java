package test.main;

import test.mypac.Remocon;

public class MainClass03 {

	public static void main(String[] args) {
		useRemocon(()->{
			//()->{} 는 interface Remocon turnOn(){}의 축약표현
			System.out.println("TV를 켭니다.");
		});
		
		useRemocon(()->{
			//()->{} 는 interface Remocon turnOn(){}의 축약표현
			System.out.println("라디오를 켭니다.");
		});
		
		useRemocon(()->{
			//()->{} 는 interface Remocon turnOn(){}의 축약표현
			System.out.println("불을 켭니다.");
		});

	}
	
	//Remocon type의 참조값을 전달 받는 메소드
	public static void useRemocon(Remocon r) {
		r.turnOn();
	}

}
