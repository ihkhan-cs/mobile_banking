// Different package non subclass

// package declaration
package org.package2;

// import statement to import the classes
// import java.util.Scanner;
import org.package1.ClassA1;
// It will import all the classes located in package1;
// import package1.*;

// I can extend ClassA1 only because this has been declared as public in ClassA1 definition
class ClassB2 extends ClassA1 {

	void variablesAccessTestFromDifferentPackageSubClass() {
		// I will get error because for different package subclass I can not access private variable
		// error: a has private access in ClassA1
		// System.out.println(super.a);

		// I will get error because for different package subclass I can not access no modifier variable
		// error: d is not public in ClassA1; cannot be accessed from outside package
		// System.out.println(super.d);

		// I will not get error because for different package subclass I can access protected variable
		System.out.println(super.f);

		// I will not get error because for different package subclass I can access public variable
		System.out.println(super.c);
	}

}