package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf = new MemberField();

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf.a = 1;
		mf.b = 'B';
		mf.c = 3.3;
		mf.d = "DD";

		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println("a = " + mf.a);
		System.out.println("b = " + mf.b);
		System.out.println("c = " + mf.c);
		System.out.println("d = " + mf.d);

	}

}
