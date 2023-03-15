package src1;

public class Example5 {

	public static void main(String[] args) {
		//논리 연산자: &&(And), ||(Or), !(Not)
		
		int a = 27;
		int b = 24;
		
		System.out.println("a>25 && b>25: "+(a<25 && b>25));	//false && flase => false
		System.out.println("a>25 && b>25: "+(a>25 && b>25));	//true && false => false
		System.out.println("a<25 && b>25: "+(a<25 && b>25));	//false && true => false
		System.out.println("a>25 && b<25: "+(a>25 && b<25));	//true && true => true
			//And연산자는 무조건 주어진 조건을 모두 만족했을 때만 참이 나옴 (논리곱)
		
		System.out.println("a>25 || b>25: "+(a<25 || b>25));	//false || flase => false
		System.out.println("a>25 || b>25: "+(a>25 || b>25));	//true || false => true
		System.out.println("a<25 || b>25: "+(a<25 || b>25));	//false || true => true
		System.out.println("a>25 || b<25: "+(a>25 || b<25));	//true || true => true
			//Or연산자는 주어진 조건 중 하나만 참이어도 참이 나옴
		
		boolean c = a>25 || b>25;
		System.out.println("c= "+c);
		System.out.println("!c= "+(!c));
		System.out.println("!(!c)= "+(!(!c)));
		
		boolean d = a>25 ^ b>25;
		System.out.println("a>25 ^ b>25: "+(a<25 ^ b>25));	//false ^ flase => false
		System.out.println("a>25 ^ b>25: "+(a>25 ^ b>25));	//true ^ false => true
		System.out.println("a<25 ^ b<25: "+(a<25 ^ b<25));	//false ^ true => true
		System.out.println("a>25 ^ b<25: "+(a>25 ^ b<25));	//true ^ true => false
		
	}

}
