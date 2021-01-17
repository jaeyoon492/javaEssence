package no04Array;

/*
 * 깃 테스트용 주석입니다.
 */

public class Helloworld48_ArrayLotto {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball배열의 각 인덱스에 1~45까지 숫자를 저장 이 안에
		}
		
		System.out.println("ball[0] : " +ball[0]);
		int tmp = 0; // 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		for (int i = 0; i < 6; i++) { // 0~5까지의 배열만 섞는다.

			j = (int) (Math.random() * 45); // 0~45까지의 임의의 값을 얻는다.
			tmp = ball[i];
			ball[i] = ball[j]; // ball[i]와 ball[j]의 수를 바꾼다.
			ball[j] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
