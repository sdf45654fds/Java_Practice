
public class Print {
	public void print(int i) {
		System.out.println("print int :" + i);
	}

	public void print(int j,int i) {
		System.out.println("print int :" +i+""+j);
	}

	public void print(int k, int i, int j) {
		System.out.println("print int :" +i+""+j+""+k);
	}

	public void print(char c) {
		System.out.println("print char :" + c);
	}

	public void print(boolean b) {
		System.out.println("print boolean :" + b);
	}

	public void print(double d) {
		System.out.println("print double :" + d);
	}

	public void print(String s) {
		System.out.println("print String :" + s);
	}

}





------------------------------------------------------------
public class PrintMain {
	public static void main(String[] args) {
		Print p = new Print();
		p.print(3);
		p.print(4.6);
		p.print("김경호");
		p.print(false);
		p.print('힣');
	} //타입이 순서가 안맞아도 알아서 찾음
}
