package test.main;

import test.mypac.Cpu;


public class test {
	public static void main(String[] args) {
		Cpu calender1 = new Cpu();
		
		calender1.nowDate="�����";
		calender1.calender();
		
		calender1.nowTime="13�� 20��";
		calender1.calender1();
		
		calender1.memberNum++;
		calender1.number();
		
		calender1.rank='A';
		calender1.ranking();
		
		calender1.total(10,20,5);
		
		
	}
	
}
