package this_;

import java.util.Scanner;

class TestClass02{
	public String name, grade;
	public int kor,eng,math,sum;
	public double avg;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		
		output();
		print();
	}
	public void output() {
		this.sum = (this.kor + this.eng + this.math);
		this.avg = (sum / 3.0);
		
		if(this.avg>=90) {
			this.grade = "A";
		}else if(this.avg >= 80) {
			this.grade="b";
		}else {
			this.grade= "c";
		}
	}
	public void print() {
		
		System.out.printf("\n총점: %d \t 평균: %.2f \t 등급: %s ", this.sum,this.avg,this.grade );
	}
}
public class quiz01 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.input();
	}
}








