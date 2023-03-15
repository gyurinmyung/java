package src4;

public class Test4 {

	public static void main(String[] args) {
		//중첩for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y) 형태로 출력하는 코드를 작성하라
		//4x + 5y = 60이 될 수 있는 x와 y의 경우의 수
		//단 x와 y는 10 이하의 자연수
		
		for(int x=1; x<=10; x++){
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}

	}

}
