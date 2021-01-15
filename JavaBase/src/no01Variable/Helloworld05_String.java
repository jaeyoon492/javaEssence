package no01Variable;

	public class Helloworld05_String {
	public static void main(String[] args) {
		
		String name="Ja"+"va";
		String str=name+8.0;
		
		
		/*문자열+anytype → 문자열+문자열 → 문자열
		 *anytype+문자열 → 문자열+문자열 → 문자열
		 */
		/* 7+"" → "7"+"" → "7 "
		 * ""+7 → ""+"7" → " 7"
		 * 
		 * 7+"7" → "7"+"7" → "77"
		 * 7+7+"" → 14+"" → "14"+"" → "14"
		 * ""+7+7 → "7"+7 → "7"+"7" → "77"
		 */
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" ");
		System.out.println(" "+7);
		System.out.println(7+"");
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7+7+"");
		System.out.println(""+7+7);
		
		
}
}
