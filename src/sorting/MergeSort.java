package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = new int[100];
		initializeArray(a);
		System.out.println("Before sort :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("After sort :");
		a = mergesort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	private static void initializeArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
	}
	public static int[] mergesort(int b[]){

		if(b.length <=1){
			return b;
		}
		int mid = b.length/2;
		int left[] = new int[mid];
		int right[];
		if(b.length % 2 == 0){
			right = new int[mid];
		}else{
			right = new int[mid+1];
		}
		for (int i = 0; i < mid; i++) {
			left[i] = b[i];
		}
		for (int i = mid; i < b.length; i++) {
			right[i-mid] = b[i];
		}
		left = mergesort(left);
		right = mergesort(right);

		int result[] = merge(left,right);
		return result;
	}
	private static int[] merge(int[] left, int[] right) {
		int result[] = new int[left.length + right.length];
		int leftIndex = 0,rightIndex = 0, resultIndex = 0;
		while(leftIndex < left.length || rightIndex < right.length){
			if(leftIndex < left.length && rightIndex < right.length){
				if(left[leftIndex] < right[rightIndex]){
					result[resultIndex] = left[leftIndex];
					resultIndex++;leftIndex++;
				}
				else{
					result[resultIndex] = right[rightIndex];
					resultIndex++;rightIndex++;
				}
			}else if(leftIndex < left.length){
				while(leftIndex < left.length){
					result[resultIndex] = left[leftIndex];
					resultIndex++;leftIndex++;
				}
			}else if(rightIndex < right.length){
				while(rightIndex < right.length){
					result[resultIndex] = right[rightIndex];
					resultIndex++;rightIndex++;
				}
			}
		}
		return result;
	}

}
