package a.b;

import a.C;

public class B {
	C mC;

	B(C c){
		mC = c;
	}

	@Override
	public String toString() {
		return mC.toString();
	}
}