package variable;

class Ex06{
	public void test1() {
		System.out.println("test1111");
		test2();
	}
	public void test2() {
		System.out.println("test2222");
		test3();
	}
	public void test3() {
		System.out.println("test3333");
	}
}

public class MainClass06 {
	int num;
	
	public static void test1() {
		System.out.println("test1111");
	}
	public static void main(String[] args) {
		Ex06 e = new Ex06();
		e.test1();
		test1();
	}
}
