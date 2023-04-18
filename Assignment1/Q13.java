//Maheshwar(2141014002)
/*
 Given two arrays in increasing order you need to find the maximum
sum by choosing a few consecutive elements from one array and then
a few elements from another array. The element switching can happen
at transition points only when the element value is the same in both
arrays
 */
public class Q13 {
	static int max(int x, int y) { return (x > y) ? x : y; }
	public static int maxPathSum(int ar1[], int ar2[], int m, int n)
	{
		int i = 0, j = 0;
		int result = 0, sum1 = 0, sum2 = 0;
		// Below 3 loops are similar to merge in merge sort;
		while (i < m && j < n) {
			if (ar1[i] < ar2[j])
				sum1 += ar1[i++];
			else if (ar1[i] > ar2[j])
				sum2 += ar2[j++];
			else {

				result += max(sum1, sum2) + ar1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while (i < m)
			sum1 += ar1[i++];
		while (j < n)
			sum2 += ar2[j++];
		result += max(sum1, sum2);

		return result;
	}
	public static void main(String[] args)
	{
		int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 };
		int m = ar1.length;
		int n = ar2.length;
        System.out.println(maxPathSum(ar1, ar2, m, n));
}

}
