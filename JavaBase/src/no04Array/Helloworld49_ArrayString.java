package no04Array;

public class Helloworld49_ArrayString {

	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };				//문자열 배열 안에 [0],[1],[2] 에 각각 순서대로 "Kim" "Park "Yi"를 저장

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:" + names[i]);	//배열길이 만큼 인덱스를 문자열 형태로 출력
		}
		String tmp = names[2];									//배열names에 세번째요소를 tmp에 저장 "Yi"를 변수tmp에 저장
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";										//배열names에 첫번쨰 요소를 "Yu"로 초기화
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:"+names[i]);	//바뀐 내용을 출력
		}
	}
}
