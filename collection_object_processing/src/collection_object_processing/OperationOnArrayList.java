package collection_object_processing;

import java.util.List;

public class OperationOnArrayList {

	private Boolean isValideStudentObject(Student s) {
		if( s.getRollNumber() != null && s.getPercentage() != null && s.getName() != null) {
			return true;
		}
		return false;
	}
	
	private void insertObjectInAL(List<Student> list, Student s) {
		if (isValideStudentObject(s)) {
			list.add(s);
		}
	}

	void init(List<Student> list) {
		insertObjectInAL(list, new Student(1, "A", 76.90));
		insertObjectInAL(list, new Student(2, "B", 76.90));
		insertObjectInAL(list, new Student(3, "C", 56.90));
		insertObjectInAL(list, new Student(4, "D", 61.90));
		insertObjectInAL(list, new Student(5, "E", 56.90));
		insertObjectInAL(list, new Student(6, "F", 67.90));
		insertObjectInAL(list, new Student(7, "G", 69.00));
		insertObjectInAL(list, new Student(8, "H", 56.90));
		insertObjectInAL(list, new Student(9, "I", 86.90));
		insertObjectInAL(list, new Student(10, "J", 45.90));
	}
	
	void printResult(ResultSet result) {
		System.out.println("A+ student list");
		System.out.println(result.classA1);
		
		System.out.println("A student list");
		System.out.println(result.classA);
		
		System.out.println("B student list");
		System.out.println(result.classB);
		
		System.out.println("C student list");
		System.out.println(result.classC);
	}
}
