 package no01Variable;

public class Helloworld07_printf {
		public static void main(String[] args) {
		
		int age=14;
		int year=2021;
		
		
		System.out.printf("age:%d%n",age);		//����age�� (%d)10�������������� ����ϰ� (%n)�ٹٲ�
		System.out.printf("age:%d%n",14);		
		System.out.printf("age:14%n");			//age�� ȭ�鿡 ��µȴ�.
		
		System.out.printf("age:%d"+"year:%d%n",age,year);
		
		String ur1="www.codechobo.com";
		float f1=.10f;
		float f2=1e1f;
		float f3=3.14e3f;
		double d=1.23456789;
		System.out.printf("f1=%f,%e,%g%n",f1,f1,f1);
		System.out.printf("f2=%f,%e,%g%n",f2,f2,f2);
		System.out.printf("f3=%f,%e,%g%n",f3,f3,f3);
		System.out.printf("d=%f%n",d);			//%f�� �Ҽ��� 6�ڸ��� ������ش�.
		System.out.printf("d=%14.10f%n",d);		//��ü 14�ڸ��� �Ҽ���10�ڸ��� ������ּ���. ��� �ֹ��Ѱ�
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",ur1);		//����ur1�� (%s)���ڿ��� ����ϰ� (%n)�ٹٲ�.
		System.out.printf("[%20s]%n",ur1);		//����ur1�� 20ĭ�ȿ��� (%20s)���ڿ��� ����ϰ� (%n)�ٹٲ�.
		System.out.printf("[%-20s]%n",ur1);		//����ur1�� 20ĭ�ȿ��� ���������Ͽ�(%-20s)���ڿ��� ����ϰ� (%n)�ٹٲ�. 
		System.out.printf("[%.8s]%n",ur1);		//���� ur1�� (%.8s)���ʿ��� 8���ڸ���� 
		}
}
