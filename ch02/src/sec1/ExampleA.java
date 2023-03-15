package sec1;

public class ExampleA {

	public static void main(String[] args) {
		//double: 배정도실수 (뒤에 d를 써줘야 더블로 취급함. 안 붙이면 float으로 처리됨)
		double a = 123.456;
		double b = 123.456d;
		double c = 'Q';
		double d = 0764.321;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("더블의 바이트 수: "+Double.BYTES);

	}

}
