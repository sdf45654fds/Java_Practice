/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개의 모음타입 
      - 배열타입변수의 선언형식
           데이타타입[] 변수이름;  ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성
	         - int[] a = new int[5];	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열[]형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType = 90;

		int[] intArray;
		intArray = new int[500];
		System.out.println("intArray배열객체주소값" + intArray);

		intArray[0] = 80; // [] = 주소.0
		intArray[1] = 11;
		intArray[2] = 22;
		intArray[3] = 33;
		intArray[4] = 44;

		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);

		int length = intArray.length;
		System.out.println("intArray객체의 멤버필드수:" + length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

		}
	}
}
