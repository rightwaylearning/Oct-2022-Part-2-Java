package functional_interface.examples;

@FunctionalInterface
// here annotation is forcing to keep 1 method inside interface.
public interface A {
   void m1(int a, int b);
   void m2();
}
// C.E >> Invalid '@FunctionalInterface' annotation; A is not a functional interface