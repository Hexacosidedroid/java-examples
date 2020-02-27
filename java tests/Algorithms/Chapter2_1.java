import java.lang.*;
import java.util.*;

class Array {
	protected int[] random_fill(int i) {
		int empty_list[] = new int[i];
		int a = 0;
		int b = 10;

		for (int j = 0; j < empty_list.length; j++) {
			empty_list[j] = a + (int) (Math.random() * b);
		}
		return empty_list;
	}
}

class FindSmallest {
	int find(int[] arr) {
		int smallest = arr[9];
		int smallest_index = 9;

		for (int i = 1; i<arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				smallest_index = i;
			}
		}
		return smallest_index;
	}
}

class SelectionSort {
	int[] selection(int[] arr) {
		int[] newArr = new int[10];
		FindSmallest ob = new FindSmallest();
		int smallest;

		for (int i = 0; i<arr.length; i++) {
			smallest = ob.find(arr);
			newArr[i] = arr[smallest];
		}
		return newArr;
	}
}

class Chapter2_1 {
	public static void main(String[] args) {
		int i = 10;
		int[] fill_list1 = new int[i];
		int[] fill_list2 = new int[i];
		Array ob1 = new Array();
		SelectionSort ob2 = new SelectionSort();

		fill_list1 = ob1.random_fill(i);
		fill_list2 = ob2.selection(fill_list1);

		for (i = 0; i<fill_list2.length; i++) {
			System.out.print(fill_list2[i] + " ");
		}
	}
}