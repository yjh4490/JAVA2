package PK22;

public class ArrayCloneTest {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("����� arr2 �迭 : ");
		//�Ϲ�for�� : for(int i=0; i<arr2.lenght;i++)
		for (int num : arr2) {
			System.out.print(num + ",");
		}
		System.out.println();

		//arr2�� ��Ұ��� ����
		arr2[3]=0;
		System.out.println("���� ��  arr1�迭: ");
		for(int num : arr2) {
			System.out.print(num + "," );
		}
		System.out.println();
	}
}
