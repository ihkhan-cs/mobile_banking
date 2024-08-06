// Same package non subclass

package org.package1;

// We do not need to use import statement, as they are in same package;

class ClassA3 {

	// In the method I have created ClassA's object and tried to access the private variable from the method
	void testAVariableFromClassA1FromNonSubClass() {
		ClassA1 cA1 = new ClassA1();
		// I will get error because for same package non subclass I can not access private variable
		//System.out.println(cA.a);

		// I will not get error because for same package non subclass I can access no modifier variable
		System.out.println(cA1.d);

		// I will not get error because for same package non subclass I can access protected variable
		System.out.println(cA1.f);

		// I will not get error because for same package non subclass I can access public variable
		System.out.println(cA1.c);
	}
}