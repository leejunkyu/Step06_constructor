package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵�");
		
		Computer com1=new Computer();
		
		Computer com2=new Computer("2017.11.16");
		
		// Cpu type �� ���� �޴� �����ڸ� �̿��ؼ� Computer ��ü�� �����ϰ� �������� com3 ��� ������ ��ƺ�����
		Computer com3=new Computer(new Cpu());
		
		//String type �� Cpu type �� ��� ���޹޴� �����ڸ� �̿��ؼ� computer ��ü�� �����ϰ� �������� com4��� ������ ��ƺ�����
		Computer com4=new Computer("asd", new Cpu());
		
		Computer com5=new Computer(1);
	}
}
