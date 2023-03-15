package src4;

public class Example {

	public static void main(String[] args) {
		//제어문: 조건분기문, 반복문, 기타 제어문으로  구성. 프로그램 실행의 흐름을 제어하는 문장
		//조건분기문: 입력되는 데이터의 조건 만족 여부에 따라 실행 내용을 달리 하도록 하는 문장
		//if~문, switch~문, 
		
		//if문
		
		int point = 80;
		String res = "";
		res = (point >= 90) ? "우수" : "보통";	//삼항연산자 (조건분기문 X)
		
		
		String res2 = "보통";
		if (point>=90) res2 = "우수";			//한 줄 if문
		
		String res3 = "보통";
		int bonus = 0;
		if (point>=90) {
			res3 = "우수";
			bonus = 10;						//실행할 문장이 두 줄 이상이면 중괄호를 쳐야 함
		}
		
		String res4 = "";
		if(point>=90) {
			res4 = "우수";
		}else {								//조건식이 만족할 때와 만족하지 않을 때를 모두 처리해야 하는 경우
			res4 = "보통";
		}
		
	}

}
