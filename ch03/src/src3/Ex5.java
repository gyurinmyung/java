package src3;

public class Ex5 {

	public static void main(String[] args) {
		//사다리꼴 넓이 = (밑변+윗변) * 높이  / 2
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop+lengthBottom) * height / 2;
		//double area = (lengthTop+lengthBottom) * height / 2.0f;
		System.out.println("사다리꼴 넓이"+area);
	

	}

}
