package test.mypac;

public class Cpu {
	public String nowDate=null;
	public String nowTime=null;
	public int memberNum=0;
	public char rank=' ';
	public int add=0;
	
	public Cpu() {
		System.out.println("Cpu() 호출됨");
	}
	
	public void calender() {
		System.out.println("오늘은"+this.nowDate+"입니다.");
	}
	public void calender1() {
		System.out.println("지금 시간은"+this.nowTime+"입니다.");
	}
	public void number() {
		System.out.println(this.memberNum);
	}
	public void ranking() {
		System.out.println(this.rank);
	}
	public void total(int num1, int num2, int num3) {
		System.out.println(num1+num2%num3);
	}
}
