// 	An example of when recursion is really needed

package net.ukr.ksm;

public class Primer_2 {

	int partition(int[] array, int start, int end) {
		int marker = start;
		for (int i = start; i <= end; i++) {
			if (array[i] <= array[end]) {
				int temp = array[marker];
				array[marker] = array[i];
				array[i] = temp;
				marker += 1;
			}
		}
		return marker - 1;
	}

	void quicksort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = partition(array, start, end);
		quicksort(array, start, pivot - 1);
		quicksort(array, pivot + 1, end);
	}

}
