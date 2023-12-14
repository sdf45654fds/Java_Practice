/*
 * 1. 주차장에서 차객체를 생성할클래스(틀)
 * 2. Car객체의 주소를 저장할수있는 타입 
 * 
 *  - 구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(매개변수){
 *           -매개변수: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *              void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
public class Car {
	/*
	* 클래스의 구성요소
	* 	1.멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할변수
	*  2.멤버메쏘드[기능]    : 차객체가 외부에제공하는기능
	*/

//멤버필드(변수)[속성]
// 1.멤버필드
	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime;// 출차시간
	private int fee; // 주차요금
// 2.생성자메쏘드

	public Car() {
	}

	public Car(String no, int inTime) {

		this.no = no;
		this.inTime = inTime;
	}

	// alt+shift+s +o
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
// 3.멤버메쏘드

	/*
	 * 멤버메쏘드(기능) (메쏘드앞에 멤버 안붙혀도됨 메쏘드는 멤버밖에 없다)
	 */
	/*
	 * 입차데이터(번호,시간)대입
	 */

	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}

	/*
	 * 출차시간 멤버필드outTime에 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	/*
	 * 주차요금계산
	 */

	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		return;
	}

	/*
	 * 차량정보헤더출력
	 */
	public void headerPrint() {
		System.out.printf("--------------------------------------------------------------\n");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("--------------------------------------------------------------\n");
	}

	/*
	 * 차량정보출력
	 */
	public void print() {
		/*
		* this
		* 		-self참조변수
		* 		-public void print() 메쏘드가 실행될때 호출주체객체의 주소값을 가지는 변수
		* 		-this는 생략가능
		*/

		System.out.printf("%6s %7d %8d      ￦%3d\n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}

	/*
	 * alt+shift+s --> r
	 */

// get set = alt + shift + s -> r

}
