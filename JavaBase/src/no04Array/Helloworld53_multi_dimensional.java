package no04Array;
import java.util.Arrays;
public class Helloworld53_multi_dimensional {

	public static void main(String[] args) {
		int[][] score= {
				 {100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
			};
			int kor = 0;
			int eng = 0;
			int math = 0;
		
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("==================================");
		
		for (int i = 0; i < score.length; i++) {			//���� ��Ÿ�� score.length(���� 0~4�ε�) �ؿ� (i+1�� �ؼ� 1~5�� ǥ�õ�) 5��
			int sum = 0;
			float avg = 0.0f;
			
			kor += score[i][0];						//�������� �� ���� �ٴ���
			eng += score[i][1];						//�������� �� ���� �ٴ���
			math += score[i][2];					//�������� �� ���� �ٴ���
			
			System.out.printf("%3d",i+1);					//���� ������ ��� 
			
			for (int j = 0; j < score[i].length; j++) {	//(0,1,2)3��
				sum += score[i][j];						//������ ���� ��(��������)
				
				System.out.printf("%6d" ,score[i][j]);	//[��][�迭] ��ġ�� ���� �� �ڸ����� ���� [0][2]=100 [2][2]=30
			}
			
			avg = sum/(float)score[i].length;			//�� ���Ѱ�(sum)���� (score[i].length)3���� ������� ��� ����� ��Ȯ�� �ϱ����� float����ȯ�� 3.0f�� ����
			System.out.printf("%5d %5.1f%n" , sum, avg);
			
		}
		
		System.out.println("==================================");
		System.out.printf("����:%4d %4d %4d%n", kor,eng,math);
	}
}
