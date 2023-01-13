package collection_object_processing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
        
		OperationOnArrayList opt = new OperationOnArrayList();
		opt.init(list);

		ResultSet result = new ResultSet();
		
		for (Student student : list) {
			
			if(student.getPercentage() >= 70.00) {
				result.classA1.add(student.getName());
			}else if(student.getPercentage() < 70.00 && student.getPercentage() >= 60.00) {
				result.classA.add(student.getName());
			}else if(student.getPercentage() < 60.00 && student.getPercentage() >= 50.00) {
				result.classB.add(student.getName());
			}else {
				result.classC.add(student.getName());
			}
			
		}
		
		opt.printResult(result);
		
	}
}
