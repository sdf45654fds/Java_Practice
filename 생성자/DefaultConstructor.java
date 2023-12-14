
public class DefaultConstructor {
	/*
	- 생성자를 하나도 정의하지않을경우 컴파일러는 디폴트(기본)생성자를 자동으로 추가한다.
	- 생성자를 하나라도     정의할경우 컴파일러는 디폴트(기본)생성자를 자동으로 추가하지않는다. 
	 */
	/*
	public DefaultConstructor() {}
	*/
	public DefaultConstructor() {
	}

	public DefaultConstructor(int a) {

	}
}




-----------------------------------------------------------
  
public class DefaultConstructorMain {

	public static void main(String[] args) {
		DefaultConstructor defaultConstructor1 = new DefaultConstructor();
		System.out.println(defaultConstructor1);
		DefaultConstructor defaultConstructor2 = new DefaultConstructor(123);
		System.out.println(defaultConstructor2);
	}

}
