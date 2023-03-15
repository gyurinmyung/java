package src1;

public class Example4 {

	public static void main(String[] args) {
		//비교 연산자: ==(같다), !=(같지 않다), >(크다), >=(이상), <(작다), <=(이하)
		//연산 결과는 true 아니면  false로 나옴
		
		int a = 15;
		int b = 17;
		
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		System.out.println("a>b: "+(a>b));
		System.out.println("a>=b: "+(a>=b));
		System.out.println("a<b: "+(a<b));
		System.out.println("a<=b: "+(a<=b));
		
		
		String c = "명규린";
		String d = "명규린";								//String은 객체의 문자열 비교 시 꼭 equals()메소드를 사용해야 함

		System.out.println("c==d: "+(c==d));			//자연비교
		System.out.println("c==d: "+(c.equals(d)));		//실제비교: 값뿐만 아니라 형식까지 같은지 확인하는 연산자
	}

}
