package no04Array;

public class Helloworld46_ArrayMaxMIN {

	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];						//�迭�� ù��° ������ max�� �ʱ�ȭ
		int min = score[0];						//�迭�� ù��° ������ min�� �ʱ�ȭ
		
		for (int i = 1; i < score.length; i++) {//�迭�� �ι�° ������ �б� ���� i�ǰ��� 1�� �ʱ�ȭ�ߴ�.
			if (score[i]> max) {
				max = score[i];					//�迭�� ù��°�� 79�� �ι�����88�� ���ؼ� ū���� max�� �ȴ�. ���� ������� max�� 88�̹Ƿ� 88�� 91�� ���ϰ� �ȴ�.
			}else if (score[i]< min) {			//min�� ���������� ó�� �ʱ�ȭ�� �� 79�� ���Ͽ� �迭�� �ִ¼��� ������ �� ���� min�� �ȴ�.
				min = score[i];
			}
		}
		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
	}

}
