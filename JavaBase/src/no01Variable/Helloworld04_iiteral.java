package no01Variable;

public class Helloworld04_iiteral {

	public static void main(String[] args) {
		
		int octNum =010;	//10을 8진수로 쓰려면 접두사에 0을 붙인다.
		int hexNum =0x10;	//10을 16진수로 쓰려면 접두사에 0x나0X를 붙인다.
		
		//큰숫자를 보기 편하게 쓰기위해 리터럴 중간에 구분자_를 넣을수 있게 됬다.
		long big=100_000_000_000L;			//long big=100000000000L; 과 같은뜻
		long hex=0xFFFF_FFFF_FFFF_FFFFL;	//long hex=0xFFFFFFFFFFFFFFFFL; 과 같은뜻
		
		float pi =3.14f;		//접미사f나 F를 사용해도 된다.(접미사 생략불가)
		double rate =1.618d;	//접미사d나 D를 사용해도 된다.(접미사 생략가능)
		
		char ch='j';			//char ch='java'; 는 리터럴이 문장열 형식이라 불가능
		String str="java";		//변수 name에 문자열 리터럴 "Java"를 저장
		
		String str1="";			//내용이 없는 문자열 사용가능
		//char ch1='';			//내용이 없는 문자  사용불가능
		char ch2=' ';			//''사이에 공백문자(blank)로 변수 ch를 초기화가능
		
		String name =new String("Java");//String객체를 생성(책의 내용 챕터9에 설명 있음)
		//String name="Java";				//위의 문장을 간단히 쓴것
		
		
	}

}
