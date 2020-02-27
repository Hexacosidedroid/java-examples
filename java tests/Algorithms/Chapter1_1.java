import java.lang.*;
import java.util.*;

class Array {
	protected int[] random_fill(int i) {
		int empty_list[] = new int[i];
		int a = 3;
		int b = 8;

		for (int j = 0; j < empty_list.length; j++) {
			empty_list[j] = a + (int) (Math.random() * b);
		}
		return empty_list;
	}
}

class Binary_search {
	protected int search(int[] list, int item) {
		int low = 0;
		int high = list.length;
		int mid;
		int guess;

		while (low <= high) {
			mid = (low + high) / 2;
			guess = list[mid];
			if (guess == item) {
				return mid;
			}
			else if (guess > item) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
}

class Chapter1_1 {
	public static void main(String[] args) {
		int i = 10;
		int[] fill_list = new int[i];
		Array ob1 = new Array();
		Binary_search ob2 = new Binary_search();

		fill_list = ob1.random_fill(i);
		System.out.println(ob2.search(fill_list, 6));
	}
}