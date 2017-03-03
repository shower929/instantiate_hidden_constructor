package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class A {
	public A(){

		// Invisible constructor
		// C c = new C("Invisible");
		// B b = new B(c);
		// System.out.println(b);
		
		Constructor<?> constructor;
		try {
			Class<?> clazz = Class.forName("a.b.B");
			constructor = clazz.getDeclaredConstructor(C.class);
			constructor.setAccessible(true);
			C c = new C("I am complete hidding and you found me");
			Object o = constructor.newInstance(c);
			System.out.println(o);
		} catch (NoSuchMethodException e) {

		} catch (InstantiationException e) {

		} catch (IllegalAccessException e) {

		} catch (IllegalArgumentException e) {

		} catch (InvocationTargetException e) {

		} catch (ClassNotFoundException e) {

		}
		
	}
}