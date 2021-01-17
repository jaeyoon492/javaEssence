package no04Array;

public class Helloworld45_Arrays_average {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		average = sum / (float)score.length;	//정확한 평균값을 구하기 위해 실수형으로 형변환 하여 출력한다.
		
		System.out.println("총합:"+sum);		//sum에 score[i]를 for문을 이용해 각각 더해주면 478 이라는 총합의 값이 나온다.
		System.out.println("평균:"+average);	//478에 score.length (배열길이)인 5를 나누면 평균이 된다.
	}

}
