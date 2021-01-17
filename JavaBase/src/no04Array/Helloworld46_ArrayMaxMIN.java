package no04Array;

public class Helloworld46_ArrayMaxMIN {

	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];						//배열의 첫번째 값으로 max를 초기화
		int min = score[0];						//배열의 첫번째 값으로 min을 초기화
		
		for (int i = 1; i < score.length; i++) {//배열의 두번째 값부터 읽기 위해 i의값을 1로 초기화했다.
			if (score[i]> max) {
				max = score[i];					//배열의 첫번째인 79와 두번쨰인88을 비교해서 큰수가 max가 된다. 다음 문장부턴 max는 88이므로 88과 91을 비교하게 된다.
			}else if (score[i]< min) {			//min도 마찬가지로 처음 초기화된 값 79와 비교하여 배열에 있는수가 낮으면 그 수가 min이 된다.
				min = score[i];
			}
		}
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
	}

}
