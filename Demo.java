
import a.A;

public class Demo {
	public static void main(String[] args) {
		Inject inject = new Inject();
		try{
			A a = (A)inject.getObject("a.A", "b.B", "b.I");
			a.use();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}