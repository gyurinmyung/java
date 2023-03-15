package src1;

public class Example1 {

	public static void main(String[] args) {
		//
		int a = 100;
		int b = 140;
		
		int c = a + b;
		System.out.println("a+b= "+c);
		
		int d = a - b;
		System.out.println("a-b= "+d);

		int e = a * b;
		System.out.println("a*b= " +e);
		
		float f = (float) b / a;
		System.out.println("b/a= "+f);
		
		int g = b % a;
		System.out.println("b%a= "+g);
		
		int h = b / 0;		//infinity
		System.out.println("b/0= "+h);
		
		int i = '명' /b;		//NaN (Not a Number)
		System.out.println("명/b= "+i);
		
		
	}

}
