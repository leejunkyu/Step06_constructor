package test.mypac;

public class Computer {
	/*
	 * [ �ʵ� �����ϱ� ]
	 *  
	 *  1. ���� ������   public(��𿡼��� ���ٰ���) | default(���� ��Ű�� �ȿ����� ���ٰ���)
	 *  2. static or non static
	 *  3. ������ type
	 *  4. �ʵ� name
	 *  5. �ʱⰪ
	 */
	
	public int count=0;
		
	// �ʵ忡 ��� ��¥�� ��� �ʹ�.
	public String productionDate=null;
	// �ʵ忡 Cpu ��ü�� �������� ��� �ʹ�
	public Cpu cpu=null;
	
	/*
	 * [ constructor(������) �����ϱ�]
	 * 
	 *  1. ���� ������
	 *  2. �����ڿ� ���� �޴� ������ ������ ������ type
	 *  3. �����ڸ� � �������� 
	 */
	
	public Computer(int count) {
		System.out.println("count ȣ���");
		this.count=count;
	}
	
	//������ (Constructor) ��ü�� �����Ҷ� ȣ��Ǵ� �κ�
	public Computer() {
		System.out.println("computer() ȣ���");
	}
	
	//���ڷ� String type �� ���� �޴� ������
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) ȣ���");
		//�������� ���ڷ� ���޵� ���� ����ʵ忡 �����ϱ�
		this.productionDate=productionDate;
	}
	//���ڷ� Cpu type �� ���� �޴� ������
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	
	//���ڷ� String type �� Cpu type �� ���� �޴� ������
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate=productionDate;
		this.cpu=cpu;
	}
	
	
	/*
	 * [ method(���) �����ϱ� ]
	 * 
	 * 1. ���� ������
	 * 2. static or non static
	 * 3. ���� ������ type
	 * 4. method ��
	 * 5. method �� ���� �޴� ������ ������ ������ type
	 */
	
	public void doGame() {
		System.out.println("������ �ؿ�");
	}
	
}
