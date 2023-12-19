package com.itwill04.array.car;

public class CarArrayMain {
	public static void main(String[] args) {
		// Car[] carArray=new Car[30];

		Car[] carArray = { new Car("1234", 1), new Car("2345", 2), new Car("5654", 8), new Car("3456", 3),
				new Car("4567", 4), new Car("3422", 12), new Car("5678", 5), new Car("6789", 7), new Car("7891", 18),
				new Car("1112", 13), new Car("1314", 14), new Car("1516", 15), new Car("1718", 16), new Car("1920", 17),
				new Car("7789", 11), new Car("1120", 10), new Car("2122", 19), new Car("2324", 20), new Car("2526", 21),
				new Car("2728", 22), new Car("2930", 23), new Car("2389", 9), new Car("3132", 24), new Car("3334", 25),
				new Car("3536", 26), new Car("3738", 27), new Car("3940", 28), new Car("4142", 29), new Car("4344", 30),
				new Car("5555", 6) };
		/*
		null.메쏘드() --> NullPointerException
		 */
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		
		System.out.println("2.전체주차구획수");
		
		System.out.println("3.남은주차구획수");
		
		
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서대입
		 */
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		
		System.out.println("7.2389번차량 12시 출차");
		
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 2389번차량 주차장에서 차량삭제
		 */
		carArray[21]=null;
		System.out.println("99. 2389번차량 출차후전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}
}
