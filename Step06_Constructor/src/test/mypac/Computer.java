package test.mypac;

public class Computer {
	/*
	 * [ 필드 정의하기 ]
	 *  
	 *  1. 접근 지정자   public(어디에서나 접근가능) | default(같은 패키지 안에서만 접근가능)
	 *  2. static or non static
	 *  3. 데이터 type
	 *  4. 필드 name
	 *  5. 초기값
	 */
	
	public int count=0;
		
	// 필드에 출고 날짜를 담고 싶다.
	public String productionDate=null;
	// 필드에 Cpu 객체의 참조값을 담고 싶다
	public Cpu cpu=null;
	
	/*
	 * [ constructor(생성자) 정의하기]
	 * 
	 *  1. 접근 지정자
	 *  2. 생성자에 전달 받는 인자의 갯수와 데이터 type
	 *  3. 생성자를 몇개 정의할지 
	 */
	
	public Computer(int count) {
		System.out.println("count 호출됨");
		this.count=count;
	}
	
	//생성자 (Constructor) 객체를 생성할때 호출되는 부분
	public Computer() {
		System.out.println("computer() 호출됨");
	}
	
	//인자로 String type 을 전달 받는 생성자
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) 호출됨");
		//생성자의 인자로 전달된 값을 멤버필드에 저장하기
		this.productionDate=productionDate;
	}
	//인자로 Cpu type 을 전달 받는 생성자
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	
	//인자로 String type 과 Cpu type 을 전달 받는 생성자
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate=productionDate;
		this.cpu=cpu;
	}
	
	
	/*
	 * [ method(기능) 정의하기 ]
	 * 
	 * 1. 접근 지정자
	 * 2. static or non static
	 * 3. 리턴 데이터 type
	 * 4. method 명
	 * 5. method 에 전달 받는 인자의 갯수와 데이터 type
	 */
	
	public void doGame() {
		System.out.println("게임을 해요");
	}
	
}
