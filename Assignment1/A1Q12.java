//Maheshwar(2141014002)
//Given an array arr[], find the maximum distance of index j and I, such
//that arr[j]>arr[I].
public class A1Q12 {
	public static int maxIndexDiff(int arr[], int n)
	{
		int maxDiff = -1;
		int i, j;

		for (i = 0; i < n; ++i) {
			for (j = n - 1; j > i; --j) {
				if (arr[j] > arr[i] && maxDiff < (j - i))
					maxDiff = j - i;
			}
		}

		return maxDiff;
	}
	public static void main(String[] args)
	{
		int arr[] = { 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
		int n = arr.length;
		System.out.println(maxIndexDiff(arr, n));
	}
}

