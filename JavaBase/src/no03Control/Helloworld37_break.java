package no03Control;

public class Helloworld37_break {

	public static void main(String[] args) {
		int sum = 0;
		int i	= 0;
		
		while (true) {		//���� �ݺ��� �� for(;;) {} �� ����
			if(sum > 100)
				break;		//�ڽ��� ���� �ϳ��� �ݺ����� �����.
			++i;
			sum += i;
		}	//while�� ��.
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}
