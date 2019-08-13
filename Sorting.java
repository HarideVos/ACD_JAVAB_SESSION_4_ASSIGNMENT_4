package fourpointfour;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = {7, 6, 8, 5, 3, 0, 9};
		recursiveCall(arr, arr.length);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void recursiveCall(int[] a, int n) {
		if (n == 0 || n == 1) return;
		else {
			int c = a.length-n;
			int min = Integer.MAX_VALUE;
			int position = -1;
			for (int i=0; i < n; i++) {
				if (a[c+i] <= min) {
					min = a[c+i];
					position = c+i;
				}
			}
			if (position < 0) return;
			else {
				int tmp = a[c];
				a[c] = a[position];
				a[position] = tmp;
				recursiveCall(a, n-1);
			}
		}
	}
}