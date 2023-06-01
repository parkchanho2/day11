package variable;

class Ex07{
	static int num=1000; // 기본 0 or null 로 자동 최기화 된다.
	public void test() {
		System.out.println(num);
	}
}
public class MainClass07 {
	static int num = 1111;
	String msg = "연습중"; // 객체를 생성해야 됨.
	public static void main(String[] args) {
		System.out.println(num);
		Ex07 e = new Ex07();
		e.test();
	}
}
