package src4;

public class Example3 {

	public static void main(String[] args) {
		
		int edps = 85;
		int sp = 70;
		int db = 95;
		int tot = edps + sp + db;
		double avg = tot / 3.0f;
		String hak = "";
		
		//컴퓨터일반, 스프레드시트 일반, 데이터베이스 일반 점수를 변수로 입력 받아 총점과 평균을 계산한 후 평균이
		//100-96 A+, 95-93 A0, 92-90 A-
		//89-86 B+, 85-83 B0, 82-80 B-
		//79-76 C+, 75-73 C0, 72-70 C-
		//69-66 D+, 65-63 D0, 62-60 D-
		//60미만 F
		
		//if ~else if~ else 문으로 hak을 A, B, C, D, F로 계산
		if(avg>=90) {
			hak = "A";
		} else if (avg>=80){
			hak = "B";
		} else if (avg>=70){
			hak = "C";
		} else if (avg>=60){
			hak = "D";
		} else
			hak = "F";
		
		//if ~else fi~ else 문으로 평균의 나머지를 정수로 바꾸어 +, 0, -를 hak 추가
		
		

	}

}
