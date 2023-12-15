
public class ReferenceTypeArrayMain {
	public static void main(String[] args) {

		/* int a; // 4바이트
		int[] ia; // 참조타입
		Account acount;
		 */

		Account[] accountArray = new Account[5];
		Account account1 = new Account(1, "KIM", 30000, 3.0);
		accountArray[0] = account1;
		accountArray[1] = new Account(2, "DD", 5600, 5.5);
		accountArray[2] = new Account(3, "AA", 9800, 3.8);
		accountArray[3] = new Account(4, "BB", 7100, 7.8);
		accountArray[4] = new Account(5, "CC", 2300, 1.2);

		accountArray[0].headerPrint();
		accountArray[0].print();
		accountArray[1].print();
		accountArray[2].print();
		accountArray[3].print();
		accountArray[4].print();
		System.out.println("-----------for loop------------");
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
	}
}
