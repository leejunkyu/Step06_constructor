package test.main;

import test.house.MyHouse;
import test.house.Television;
import test.house.MicroWave;
import test.house.Aircon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 인자로 Aircon, Television, MicroWave 객체를 전달 받는 생성자를 이용해서 MyHouse 객체를 생성후 참조값을 house1 이라는
		 * 변수에 담아보세요
		 */
		MyHouse house1=new MyHouse(new Aircon(), new Television(), new MicroWave());
		house1.air.cool();
	}
}
