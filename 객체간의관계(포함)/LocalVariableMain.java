
public class LocalVariableMain {
	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		/* << 1.The local variable tot1 may not have been initialized >>
		 *  int tot1;
		 *  System.out.println("tot1=" + tot1);
		 * 모든 변수는 반드시 초기화 하여야 사용할 수 있다.
		 */
		int tot1;
		tot1 = 0;
		System.out.println("tot1=" + tot1);

		/* << 2.The local variable tot may not have been initialized >> 
			int tot;
			boolean condition=true;
			if(condition) {
				tot=0;
			}
			System.out.println("tot=" +tot);
		*/

		int tot2;
		boolean condition2 = true;
		if (condition2) {
			tot2 = 0;
		} else {
			tot2 = 1;
		}
		System.out.println("tot2=" + tot2);

		int tot3;
		tot3 = 0;
		tot3 += 3;
		System.out.println("tot3=" + tot3);
		/*
		 * local변수(참조형변수)
		 */

		/* <<3.The local variable order1 may not have been initialized >>
			Order order1;
			order1.print();
		*/

		/* <<4.The local variable order2 may not have been initialized>>
			Order order1;
			order1=new Order(1,"아이패드외3종","2023-12-19",56000);
			order1.print();
		
			Order order2;
			boolean condition22=false;
			if(condition22) {
				order2=new Order(2,"패딩조끼","2023-12-19",50000);
			}
			order2.print();
		*/

		Order order1;
		order1 = new Order(1, "아이패드외3종", "2023-12-19", 56000);
		order1.print();

		Order order2;
		boolean condition22 = false;
		if (condition22) {
			order2 = new Order(2, "패딩조끼", "2023-12-19", 50000);
		} else {
			order2 = new Order(2, "NOTEBOOK", "2023-12-19", 550000);
		}
		order2.print();

		Order order3 = null;

		if (order3 == null) {
			order3 = new Order(3, "시계외2종", "2023-12-12", 80000);
		}

		order3.print();

	}
}