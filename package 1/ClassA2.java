// Same package subclass

package org.package1;

// We do not need to use import statement, as they are in same package;

// I am extending ClassA1, both ClassA1 and ClassA2 are in the same package
class ClassA2 extends ClassA1 {

	// In the method I will try to call super class variable A, which is declared as private
	void testAVariableFromClassA1FromSubClass() {
		// I will get error because for same package subclass I can not access private variable
		// System.out.println(super.a);

		// I will not get error because for same package subclass I can access no modifier variable
		System.out.println(super.d);

		// I will not get error because for same package subclass I can access protected variable
		System.out.println(super.f);

		// I will not get error because for same package subclass I can access public variable
		System.out.println(super.c);

	}
}