package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {54,78 ,80, 79, 6 ,47, 92, 37, 29, 47};
		//int a[] = {7,5,11};

		//initializeArray(a);
		System.out.println("Before sort :");
		printArray(a);
		System.out.println();
		quickSort(a, 0, a.length-1);
		System.out.println("After sort :");
		
		printArray(a);
	/*	int b[] = {54,78 ,80, 79, 6 ,47, 92, 37, 29, 43};
		partition(b, 0, 9, 92);*/
	}
	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void quickSort(int[] a , int left, int right){
		System.out.println("-------------------------------------------------------------");
		if(left >= right){
			System.out.println("return as left = "+left+" is greater/equal than right = "+right);
			return;
		}
		System.out.println("left = "+left+"  right = "+right);
		int pivot = (left+right)/2;
		//System.out.println("pivot is = "+a[pivot]);
		int partition = partition(a,left,right,a[pivot]);
		printArray(a);
		quickSort(a, left, partition-1);
		quickSort(a, partition, right);
	}
	private static int partition(int[] a, int left, int right, int pivot) {
		while(left <= right){
			while(left < a.length && a[left] < pivot){
				left++;
			}
			while(right >=0 && a[right] > pivot){
				right --;
			}
			if(left <= right){
			//	System.out.println("swap left = "+a[left] +"  and right = "+a[right]);
				swap(a,left,right);
				left++;right--;
			}
		}
	//	System.out.println("next partition at left = "+left);
		return left;
	}
	private  static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	private static void initializeArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
	}

}
