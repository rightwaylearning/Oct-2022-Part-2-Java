package PredicateInterface.example.demo;

import java.util.function.Predicate;

/**
 * 
 * joins of Predicate
 * and()
 * or()
 * negate()
 *
 */
public class JoinsOfPredicate {

	public static void main(String[] args) {
		

        Predicate<Integer> p1 = i -> i%5 == 0;
        Predicate<Integer> p2 = i -> i % 2 == 0;

        Predicate<Integer> p= p1.or(p2);
                
        System.out.println(p.test(10));  // true
        System.out.println(p.test(15));  // false

	}
}


