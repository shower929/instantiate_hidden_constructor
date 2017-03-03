package a;
import a.b.B;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class A {
	public A(){
		// Invisible constructor
		// C c = new C("Invisible");
		// B b = new B(c);
		// System.out.println(b);
		
		Constructor<B> constructor;
		try {
			constructor = B.class.getDeclaredConstructor(C.class);
			constructor.setAccessible(true);
			C c = new C("I am hidding and you found me");
			B b = constructor.newInstance(c);
			System.out.println(b);
		} catch (NoSuchMethodException e) {

		} catch (InstantiationException e) {

		} catch (IllegalAccessException e) {

		} catch (IllegalArgumentException e) {

		} catch (InvocationTargetException e) {

		}
		
	}
}