package no04Array;

/*
 * �� �׽�Ʈ�� �ּ��Դϴ�.
 */

public class Helloworld48_ArrayLotto {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball�迭�� �� �ε����� 1~45���� ���ڸ� ���� �� �ȿ�
		}
		
		System.out.println("ball[0] : " +ball[0]);
		int tmp = 0; // ���� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		for (int i = 0; i < 6; i++) { // 0~5������ �迭�� ���´�.

			j = (int) (Math.random() * 45); // 0~45������ ������ ���� ��´�.
			tmp = ball[i];
			ball[i] = ball[j]; // ball[i]�� ball[j]�� ���� �ٲ۴�.
			ball[j] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
