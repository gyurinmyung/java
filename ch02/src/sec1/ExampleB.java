package sec1;

public class ExampleB {

	public static void main(String[] args) {
		//boolean: 부울대수인 true 또는 false를 저장하는 자료형
		boolean a = true;
		boolean b = false;
		boolean c = !a;		//!는 반대하다의 의미. !a는 곧 flase라는 뜻
		boolean d = !b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println("표현범위: "+Boolean.TRUE+" 또는 ");
		System.out.println(Boolean.FALSE);
		
	}

}
