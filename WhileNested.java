
public class WhileNested {

	public static void main(String[] args) {
		
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		System.out.println("-----------------------");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		
		System.out.println("-----------------------");
		int i=0;
		while(i<5) {
			System.out.print("★");
			System.out.print("★");
			System.out.print("★");
			System.out.print("★");
			System.out.print("★");
			System.out.print("\n");
			i++;
		}
		
		System.out.println("-----------------------");
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}






