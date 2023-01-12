package PredicateInterface.example.demo;

import java.util.function.Predicate;

/*  // No need to write this interface it's readymade  inside java.util.function this package
 * interface Predicate<Type>{
 *   boolean test(Type t);
 * }
 * 
 */
public class Controller {

	public static void main(String[] args) {
		
		Predicate<Student> p = s -> s.getPercentage() >= 60;
		
		Student s = new Student("Sandesh",67.80);
		Student s1 = new Student("Rahul",37.80);
		
		System.out.println(p.test(s));  // true
		System.out.println(p.test(s1)); // false
		
	}
}


