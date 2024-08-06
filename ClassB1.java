// Different package subclass

// package declaration
package org.package2;

// import statement
import org.package1.ClassA1;

// class ClassB1
public class ClassB1 {

	int b;

	// It is only accessible because it has been declared as public
	ClassA1 cA1;

	public ClassB1() {
		System.out.println("Default Constructor of ClassB1");
	}


	void variablesAccessTestFromDifferentPackageSubClass() {
		// I will get error because for different package non subclass I can not access private variable
		ClassA1 cA2 = new ClassA1();
		// error: a has private access in ClassA1
		// System.out.println(cA2.a);

		// I will get error because for different package non subclass I can not access no modifier variable
		// error: d is not public in ClassA1; cannot be accessed from outside package
		// System.out.println(cA2.d);

		// I will get error because for different package non subclass I can not access protected variable
		// error: f has protected access in ClassA1
		// System.out.println(cA2.f);

		// I will not get error because for different package non subclass I can access public variable
		System.out.println(cA2.c);
	}
}