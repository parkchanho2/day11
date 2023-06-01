package variable;

class Ex04{
	private String name;
	public void input(){
		name = "홍길동";
	}
	public void pring() {
		System.out.println("당신의 이름은: " + name);
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		Ex04 e = new Ex04();
		e.input(); e.pring();
		
	}
}
