package src4;

public class Example6 {

	public static void main(String[] args) {
		//java 12 이상 버전에 추가된 switch문: -> (yield)
		
		
		float num1 = (float) Math.random();			//.random: 0~1의 실수를 구하는 메소드
		int num = (int) (Math.random()*6)+1;		//1~6의 무작위 임의의 수를 대입. 끝 수를 곱하고 마지막에 시작 수를 더함
		System.out.println("임의의 수 [1~6]: "+num);
		
		
		//num이 1이나 2일 경우 하위수, 3이나 4일 경우 중위수, 그 외일 경우 상위수
		
		if (num==1 || num==2){
			System.out.println("하위수");
		} else if (num==3 || num==4){
			System.out.println("중위수");
		} else {
			System.out.println("상위수");
		}
		
		switch (num) {
			case 1:
			case 2:
				System.out.println("하위수");
				break;
			case 3:
			case 4:
				System.out.println("중위수");
				break;
			default:
				System.out.println("상위수");
		}
	}

}