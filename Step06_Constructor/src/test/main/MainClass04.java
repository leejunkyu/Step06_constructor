package test.main;

import test.house.MyHouse;
import test.house.Television;
import test.house.MicroWave;
import test.house.Aircon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * ���ڷ� Aircon, Television, MicroWave ��ü�� ���� �޴� �����ڸ� �̿��ؼ� MyHouse ��ü�� ������ �������� house1 �̶��
		 * ������ ��ƺ�����
		 */
		MyHouse house1=new MyHouse(new Aircon(), new Television(), new MicroWave());
		house1.air.cool();
	}
}
