package no03Control;

public class Helloworld23_Conditional_expression {

	public static void main(String[] args) {
		int x=0;
		System.out.printf("x=%d �� ��, ���� ����%n" ,x);
		
		if(x==0) System.out.println("x==0");//��
		if(x!=0) System.out.println("x!=0");//�ȵ�
		if(!(x==0)) System.out.println("!(x==0)");//��
		if(!(x!=0)) System.out.println("!(x!=0)");//�ȵ�
		
		x=1;
		System.out.printf("x=%d �� ��, ���� ����%n", x);
		
		if(x==0) System.out.println("x==0");//�ȵ�
		if(x!=0) System.out.println("x!=0");//��
		if(!(x==0))System.out.println("!(x==0)");//��
		if(!(x!=0)) System.out.println("!(x!=0)");//�ȵ�
	}

}
