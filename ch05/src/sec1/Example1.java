package sec1;

public class Example1 {

	public static void main(String[] args) {
		//데이터 타입
		//기본형 (원시형)
		//참조형 (배열형, 열거형, 클래스, 인터페이스)
		
		int[] arr = { 1, 80, 90, 70 };
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		int[][] arr2 = {{ 1, 80, 90, 70 }, { 1, 80, 90, 70 }};
		System.out.println("번호\t국어\t수학\t영어");
		for(int i=0; i<2; i++) {		//줄 (두 줄)
			for(int j=0; j<4; j++) {	//칸 (네 칸)
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
