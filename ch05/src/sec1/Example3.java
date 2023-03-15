package sec1;

public class Example3 {

	public static void main(String[] args) {
		
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4;
		
		arr1 = new int[]{ 1, 90, 80, 70 };
		arr2 = new int[]{ 1, 90, 80, 70 };
		arr3 = arr2;						//얕은 복제는 실제 데이터의 주소만 전달하므로 같은
		
		System.out.println("arr1: "+arr1);
		System.out.println("arr2: "+arr2);
		System.out.println("arr3: "+arr3);
		//System.out.println("arr4: "+arr4);
		//arr4는 포인터인 실제 주소를 배정하지 않았으므로 NullPointerExeption 에러가 남
		
		System.out.println();
		for(int data : arr1) {
			System.out.println(data+"\t");
		}
		System.out.println();
		for(int data : arr2) {
			System.out.println(data+"\t");
		}
		for(int data : arr3) {
			System.out.println(data+"\t");
		}
		System.out.println();
		System.out.println("arr1==arr2: "+(arr1==arr2));
		System.out.println("arr2==arr3: "+(arr2==arr3));
		System.out.println("arr1!=arr2: "+(arr1!=arr2));
		System.out.println("arr2!=arr3: "+(arr2!=arr3));
	}

}
