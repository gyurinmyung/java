package sec1;

public class Example2 {

	public static void main(String[] args) {
		// java의 기본 자료형(primitive type) 변수는 반드시 초기화 되어야 한다.
		byte a = 127;  			//1byte(-128~127)
		boolean b = true;  		//1byte (true, false)
		short c = 128;  		//2byte (-2의 15승 ~ 2의 15승-1)
		int d = 65536;  		//4byte(-2의 31승 ~ 2의 31승-1)
		long e = 655360000;  	//8byte (-2의 63승 ~ 2의 63승-1)
		float f = 3.14f;  		//4byte, 실수 (소수점 이하가 존재하는 수)일 땐 숫자 뒤에 f를 넣어야 함
		double g = 3.14;  		//8byte, 실수
		// 실수 = 부동소수점수 (Floating point number)
		char h = 'k';  			//2byte, 숫자를 대입해도 그 숫자에 해당하는 아스키 코드, 즉 문자로 출력됨
		char i = 65;
		System.out.println("i="+i);
	}

}
