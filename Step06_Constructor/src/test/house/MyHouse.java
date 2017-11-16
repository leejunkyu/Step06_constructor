package test.house;

public class MyHouse {
	public Aircon air=null;
	public Television tv=null;
	public MicroWave mw=null;
	
	//default 생성자
	public MyHouse() {
		
	}
	//인자로 Aircon, Television, MicroWave 객체를 전달받는 생성자
	public MyHouse(Aircon air, Television tv, MicroWave mw) {
		this.air=air;
		this.tv=tv;
		this.mw=mw;
	}
}
