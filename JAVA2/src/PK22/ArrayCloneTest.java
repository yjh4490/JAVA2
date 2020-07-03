package PK22;

public class ArrayCloneTest {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 arr2 배열 : ");
		//일반for문 : for(int i=0; i<arr2.lenght;i++)
		for (int num : arr2) {
			System.out.print(num + ",");
		}
		System.out.println();

		//arr2의 요소값을 변경
		arr2[3]=0;
		System.out.println("변경 후  arr1배열: ");
		for(int num : arr2) {
			System.out.print(num + "," );
		}
		System.out.println();
	}
}
