package aarayprogram;

public class Stutinfo {

	Student[] getinfo() {
		Student[] s = new Student[4];
		s[0] = new Student("nirmal", 12, "at post dde");
		s[1] = new Student("kuldip", 13, "at post pimpri");
		s[2] = new Student("vishwa", 14, "at post dde");
		s[3] = new Student("prashu", 15, "at post borad");

		for (int i = 0; i <= s.length; i++) {
			System.out.println(s[0].getStudentName());
			System.out.println(s[0].getRollNumber());
			System.out.println(s[0].getAdr());
		
		}
		return s;
	}

	
}
