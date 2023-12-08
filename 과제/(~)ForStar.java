
public class ForStar {
public static void main(String[] args) {
	/* ☆★★★★
	   ★☆★★★
	   ★★☆★★
	   ★★★☆★
	   ★★★★☆
	*/
	System.out.println("1.-------------------------------");
	int a=1;
	while(a<=9) {
		int b=2;
		while(b<=9) {
			System.out.printf("%d*%d=%d ",b,a,a*b);
			b++;
		}
		System.out.println("\n");
		a++;
		}
	
	System.out.println("2.---------------------------");
	
	
	System.out.println("3.---------------------------");
	 for (int i = 0; i < 5; i++) {
         //세로 5칸에 입력할 for문
           for (int j = 0; j <= i; j++) {
  	 //별(*)문자를 가로로 증가시키는 반복문
               System.out.print("★");
         //강제개행을 하지 않고 출력시키게 하는게 포인트입니다.
                      
           }
           System.out.println("");        
       }
	 
	System.out.println("4.---------------------------");
	for (int i = 5; i > 0; i--) {
        //처음에 5개를 찍고 1개씩 감소하는 반복문입니다.
            for (int j = 0; j < i; j++) {
                System.out.print("★");
                       //i값 개수에 따라서 별의 개수가 변하도록 합니다.
            }
            System.out.println();        
        }
	
	System.out.println("5.---------------------------");
	
}
}
