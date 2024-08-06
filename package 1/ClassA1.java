// Same Class

// This should be the first declaration of any source file
// This is how we declare a package.
package org.package1;

// When I was showing different package (subclass non-subclass example, I need to add public access specifier to my class ClassA)
//class ClassA1
public class ClassA1 {

	// We have created a private variable to see whether it works in same class
	// also it is not accessible in same package (subclass and non subclass) and also outside of package (subclass and non subclass)
	private int a;

	double d;

	protected float f;

	public char c;

	public ClassA1() {
		System.out.println("Default Constructor of ClassA1");
	}

	// I can access my private variable a inside the same class, see the setter & getter method
	void setA(int a) {
		this.a = a;
	}

	int getA() {
		return a;
	}
}