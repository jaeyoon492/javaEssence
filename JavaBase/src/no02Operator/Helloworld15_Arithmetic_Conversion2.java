package no02Operator;

public class Helloworld15_Arithmetic_Conversion2 {
	public static void main(String[] args) {
		//int���� ���� ������ �����ϸ� int�� �����Ǿ� ���ȴ�.
		byte a=10;
		byte b=30;
		byte c=(byte)(a+b);
		//byte+byte�� c�� ������ int�� �ٲٰų� (a+b)�� byte�� ����ȯ �ؾ� �Ѵ�.
		
		System.out.println(c);
		
		int c1=a*b;
		
		System.out.printf("%d * %d=%d%n",a,b,c1);
		
		
		byte c2=(byte)(a*b);
		
		System.out.printf("%d * %d=%d%n",a,b,c2);
		//10*30�� ���� 300������ int�� byte�� ����߱� ������ ���ս��� �Ͼ���̴�.
		
		int a3=1_000_000;
		int b3=2_000_000;
		
		long c3= a3*b3;
		//int��int�� ���Ҷ� ����c3�� longŸ������ �ٲ۰� ������, a3 * b3�� 10��16�����̶� int�� ������ �ѱ⶧���� �����÷ο찡 �ȴ�.
		
		System.out.println(c3);
		
		c3=(long)a3*b3;//�̷������� int������ �ϳ��� longŸ������ ��ȯ�ϸ� b3�� longŸ������ �����ȯ�Ǿ� longŸ������ ����ȴ�.
		
		System.out.println(c3);
		
		long a4= 1_000_000*1_000_000;
		long b4= 1_000_000*1_000_000L;
		
		System.out.println("a4="+a4);//int������ �ʿ������Ƿ� �����÷ο� �߻�
		System.out.println("b4="+b4);//�ڿ� L�� �ٿ� long���� ����Ǳ� ������ �����۵�
	}
}

