package sec1;

public class Example7 {

	public static void main(String[] args) {
		// long. 뒤에 L을 붙여야 int로 취급되지 않음
		long a = 123456789000L;
		long b = 365L;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("a의 메모리주소: "+System.identityHashCode(a));
	}

}
