package no04Array;

public class Helloworld45_Arrays_average {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		average = sum / (float)score.length;	//��Ȯ�� ��հ��� ���ϱ� ���� �Ǽ������� ����ȯ �Ͽ� ����Ѵ�.
		
		System.out.println("����:"+sum);		//sum�� score[i]�� for���� �̿��� ���� �����ָ� 478 �̶�� ������ ���� ���´�.
		System.out.println("���:"+average);	//478�� score.length (�迭����)�� 5�� ������ ����� �ȴ�.
	}

}
