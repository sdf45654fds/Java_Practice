
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		
		char c1=0;
		
		while(c1 < 65535) {
			System.out.print(c1);
			c1++;
			if(c1%100==0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		/*
		 * - 영문소문자출력
		 *   a b c d e f g h i j k l m n o p q r s t u v w x y z 
		 */
		char c2='a';
		while(c2<='z') {
			System.out.print(c2+" ");
			c2++;
		}
		System.out.println();
		/* << Quiz >>
		 * - 영문소문자출력
		 *   a b c d e
		 *   f g h i j 
		 *   k l m n o 
		 *   p q r s t 
		 *   u v w x y 
		 *   z 
		 */
		
		/*
		 *  한글 출력
		 */
		char han='가';
		while(han<='힣') {
			System.out.print(han);
			han++;
			if(han%100==0) {
				System.out.print("\n");
			}
		}
		System.out.println();
	}

}














