
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		/*
		  AcademyMember n1=new AcademyMember(0,"누구우");
		*/
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "KAN", "JAVA");

		AcademyGangsa gs1 = new AcademyGangsa(3, "SIN", "OFFICE");
		AcademyGangsa gs2 = new AcademyGangsa(4, "LEE", "ANDROID");

		AcademyStaff sf1 = new AcademyStaff(5, "LIN", "영업");
		AcademyStaff sf2 = new AcademyStaff(6, "JIN", "총무");

		System.out.println("----Student-------");
		st1.print();
		st2.print();
		System.out.println("----Gangsa--------");
		gs1.print();
		gs2.print();
		System.out.println("----Staff---------");
		sf1.print();
		sf2.print();

	}

}
