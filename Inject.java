
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Inject {
	public Inject(){}

	public Object getObject(String a, String b, String i) throws Exception{
		Constructor<?> constructorA;
		Constructor<?> constructorB;
		
		Object objectA = null;

		try {
			Class<?> classI = Class.forName(i);

			Class<?> classA = Class.forName(a);
			constructorA = classA.getDeclaredConstructor(classI);

			Class<?> classB = Class.forName(b);
			constructorB = classB.getDeclaredConstructor();
			constructorB.setAccessible(true);
			Object objectB = constructorB.newInstance();

		 	objectA = constructorA.newInstance(objectB);

		} catch (NoSuchMethodException e) {
			throw new Exception(e.getMessage());
		} catch (InstantiationException e) {
			throw new Exception("Can not instant: " + e.getMessage());
		} catch (IllegalAccessException e) {
			throw new Exception(e.getMessage());
		} catch (IllegalArgumentException e) {
			throw new Exception(e.getMessage());
		} catch (InvocationTargetException e) {
			throw new Exception(e.getMessage());
		} catch (ClassNotFoundException e) {
			throw new Exception("Class not found: " + e.getMessage());
		}

		return objectA;
	}
}
