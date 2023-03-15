package sec2;

public class Example2 {

	public static void main(String[] args) {
		//자동 형 변환: 작은 -> 큰
		byte a = 10;
		short b = a;
		int c = b;
		float d = c;
		long e = (long) d; //강제 형 변환. 단, 실수에서 정수로 변환 시에는 변환 불가능
		double f = e;
		//강제 형 변환은 형 변환 연산자로 함

	}

}
