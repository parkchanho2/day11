package variable;

class Ex03{
	int num = 100;
	public void test1() {
		System.out.println("test1 num: " + num);
		num = 200;
	}
	public void test2() {
		System.out.println("test2 num: " + num);
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		Ex03 t = new Ex03();
		
		t.test1();
		t.test2();
	}
}
