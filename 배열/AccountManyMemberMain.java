
public class AccountManyMemberMain {
	public static void main(String[] args) {
		AccountManyMember accountManyMember = new AccountManyMember();

		System.out.println(accountManyMember);
		System.out.println(accountManyMember.acc0);
		System.out.println(accountManyMember.acc1);
		System.out.println(accountManyMember.acc2);
		System.out.println(accountManyMember.acc3);
		System.out.println(accountManyMember.acc4);

		Account account1 = new Account(1, "KA", 3000, 2.5);
		Account account2 = new Account(2, "KB", 8000, 1.2);
		Account account3 = new Account(3, "KC", 5000, 8.1);
		Account account4 = new Account(4, "KD", 1000, 7.4);
		Account account5 = new Account(5, "KE", 6000, 4.9);

		accountManyMember.acc0 = account1;
		accountManyMember.acc1 = account1;
		accountManyMember.acc2 = account1;
		accountManyMember.acc3 = account1;
		accountManyMember.acc4 = account1;

		accountManyMember.acc0.headerPrint();
		accountManyMember.acc0.print();
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
	}
}
