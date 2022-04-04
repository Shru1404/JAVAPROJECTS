// Java program to implement
// the above approach
import java.util.*;

class GFG{

// Function to check if the inverse
// permutation of the given array is
// same as the original array
static void inverseEqual(int arr[], int n)
{
	
	// Stores the inverse
	// permutation
	int[] brr = new int[n];

	// Generate the inverse permutation
	for(int i = 0; i < n; i++)
	{
		int present_index = arr[i] - 1;
		brr[present_index] = i + 1;
	}

	// Check if the inverse permutation
	// is same as the given array
	for(int i = 0; i < n; i++)
	{
		if (arr[i] != brr[i])
		{
			System.out.println("No");
			return;
		}
	}
	System.out.println("Yes");
}

// Driver code
public static void main(String[] args)
{
	int n = 4;
	int[] arr = { 1, 4, 3, 2 };

	inverseEqual(arr, n);
}
}

// This code is contributed by offbeat
