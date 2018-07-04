package gitdemo;

public class Test {

	void method() {
		System.out.println(getClass().getName());
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.method();
		System.out.println("Testing");
	}
}
