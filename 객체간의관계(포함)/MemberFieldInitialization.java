
public class MemberFieldInitialization {

	public int member1; // 0
	public double member2; // 0.0
	public char member3; // 0 , '\u0000'
	public boolean member4; // false
	public String member5; // null
	public Order member6; // null

	public int member11 = 999;
	public double member22 = 3.1;
	public char member33 = '힣';
	public boolean member44 = true;
	public String member55 = "화요일";
	public Order member66 = new Order(1111, "자바잘하는법", "2023-12-18", 20000);

	/*
	 * 1-3 생성자 초기화
	 */
	public MemberFieldInitialization() {
	}

	public MemberFieldInitialization(int member1, double member2, char member3, boolean member4, String member5,
			Order member6, int member11, double member22, char member33, boolean member44, String member55,
			Order member66) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
		this.member11 = member11;
		this.member22 = member22;
		this.member33 = member33;
		this.member44 = member44;
		this.member55 = member55;
		this.member66 = member66;
	}

}
