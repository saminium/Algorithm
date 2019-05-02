package QuickSort;

import java.util.Arrays;

public final class QuickSortMain {

	public static void main(String[] args) throws ClassNotFoundException {
		int[] array = new int[]{6, 3, 5, 9, 8, 1, 7};
		System.out.println(" arrays before sorted : " + Arrays.toString(array));
		QuickSort(array, 0, array.length - 1);
		System.out.println(" arrays after sorted : " + Arrays.toString(array));
	}

	public static void QuickSort(int[] array, int start, int end) throws ClassNotFoundException {
		
		//Partition - finding pivot index

			int pivotIndex = partition(array, start, end);
			//Sort left of the pivot
			QuickSort(array, start, pivotIndex-1);
			//Sort right of the pivot
			QuickSort(array, pivotIndex + 1, end);


		
	}

	private static final int partition(int[] array, int start, int end){
		int pivot = array[end];
		int pivotIndex = start -1;
		if(start < end){
			for(int i = start; i < array.length - 1; i++ ){
				if(array[i] < pivot){
					pivotIndex++;
					swap(array, i, pivotIndex);
				}
			}
			swap(array, pivotIndex, end);
		}

		return pivotIndex;
	}

	private static void swap(int[] array, int i, int pivotIndex) {
		int temp = array[pivotIndex];
		array[pivotIndex] = array[i];
		array[i] = temp;
	}
}
