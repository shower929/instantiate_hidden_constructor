package a;

import b.I;

public class A {
	private I mI;

	public A(I o){	
		mI = o;
	}

	public void use() {
		System.out.println(mI.method());
	}
}