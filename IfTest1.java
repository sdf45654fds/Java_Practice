
public class IfTest1 {
	/*
	 * 코드정렬단축키 ctrl + shift + f
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("main black start");
		System.out.println("stmt1");
		boolean condition = true;

		if (condition) {
			/*
			 * condition변수의값이 true일때실행코드블록
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}
		System.out.println("stmt5");
		if (condition) {
			/*
			 * condition변수의값이 true일때실행코드블록
			 */
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			/*
			 * condition변수의값이 false일때실행코드블록
			 */
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("stmt10");

		if (condition)
			System.out.println("stmt11");

		System.out.println("stmt12");

		if (condition)
			System.out.println("stmt13");
		else
			System.out.println("stmt14");

		System.out.println("stmt15");
		System.out.println("main block end");
		/*
		 * return
		 *   - 현재 return문을 실행하는 실행흐름을 
		 *     실행흐름을만들어서 호출한곳으로 반환한다.
		 *   - return문 생략가능
		 */
		return;

	}
}
