package patil.vaibhav4_10_2022;

public class Controller {
public static void main(String[] args) {
	Student s=new Student();
	s.name="Mustaqeem";
	s.rollnumber=12;
	
	Marks m1=new Marks();
	Marks[] sub=new Marks[3];
	m1.subject="Marathi";
	m1.score=90;
	sub[0]=m1;
	
	Marks m2=new Marks();
	m2.subject="Mathmatics";
	m2.score=95;
	sub[1]=m2;
	
	Marks m3=new Marks();
	m3.subject="English";
	m3.score=80;
	sub[2]=m3;
	
	s.mks=sub;
	
	System.out.println("Student Name:"+s.name);
	System.out.println("Student Roll no,:"+s.rollnumber);
	
	for(int i=0;i<s.mks.length;i++) {
	System.out.println("Subject Name::"+s.mks[i].subject +"\n" +"Subject Score::" +s.mks[i].score);
	System.out.println("-----------------------------------------------------------------------------");}
	
//	for(int i=0;i<s.mks.length;i++) {
//	System.out.println(s.mks[i].subject);
//	System.out.println(s.mks[i].score);
//	System.out.println("------------------------------------------------------------------------------------------");
//}
	
}
}
