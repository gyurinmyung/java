package src1;

public class Example3 {

	public static void main(String[] args) {
		//부호 연산자 및 증감 연산자

		int a = 30;
		int b = 50;
		int c = a - b;
		c = -c;		//부호 연산자 -
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		
		
		int sw = 1;
		System.out.println("sw= "+sw);
		sw = sw * -1;
		System.out.println("sw= "+sw);
		sw = sw * -1;
		System.out.println("sw= "+sw);
		//부호 연산자 -1
		
		
		a = 20;
		b = 20;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println(a++);		//a=a+1  후위연산: 먼저 결과 출력 후 a를 1 증가 시킴
		System.out.println(++b);		//b=b+1  전위연산: 먼저 b를 1 증가 시킨 후 결과 출력
		
		int x = 10;
		int y = 10;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println(x--);		//x=x-1  후위연산
		System.out.println(--y);		//y=y-1  전위연산
		
		
	}

}
