/*
04.OOP[다형성-오버로딩] 오버로딩=과부화,다중정의
p.263
*/

class OverLoading { <- //2개의 클래스 하나로 간단히 보고싶을때 (굳이 안해도됨) 
public void method() {
		System.out.println("public void method()");
	}
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	public void method(String a) {
		System.out.println("public void method(String a)");
	}
	
	public void method(int a,int b) {
		System.out.println("public void method(int a,int b)");
	}
	public void method(int a,String b) {
		System.out.println("public void method(int a,String b) ");
	}
	public void method(int a,int b,int c) {
		System.out.println("public void method(int a,int b,int c)");
	}
	public void method(String a,int b,int c) {
		System.out.println("public void method(String a,int b,int c)");
	}
} //인자가 여러개 있을떄 타입의 조합이 일치해야함

public class OverLoadingMain {

	public static void main(String[] args) {
    OverLoading overLoading = new OverLoading();
		overLoading.method();
		overLoading.method(123);
		overLoading.method("김수한무~~");
		overLoading.method(100, 200);
		overLoading.method(100, "이백");
		overLoading.method(1, 2, 3);
		overLoading.method("일", 2, 3);
	}
}
