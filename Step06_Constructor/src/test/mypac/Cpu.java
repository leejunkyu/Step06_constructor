package test.mypac;

public class Cpu {
	public String nowDate=null;
	public String nowTime=null;
	public int memberNum=0;
	public char rank=' ';
	public int add=0;
	
	public Cpu() {
		System.out.println("Cpu() ȣ���");
	}
	
	public void calender() {
		System.out.println("������"+this.nowDate+"�Դϴ�.");
	}
	public void calender1() {
		System.out.println("���� �ð���"+this.nowTime+"�Դϴ�.");
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
