package gitdemo;

public class Test {

	void method() {
		System.out.println(getClass().getName());
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Before calling method");
		test.method();
		System.out.println("Testing");
		
	}
}
