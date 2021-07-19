package com.sample.Logictricks;

public class climbingStaircase {

	public static void main(String[] args) {
		System.out.println("" + new climbingStaircase().climbStairs(5));
		System.out.println(climbStairsWithoutExtraArray(5));
		System.out.println(climbKStairs(5, 2));

	}

	public static int climbStairs(int n) {
		// Time Complexity - O(n)
		// Space Complexity -O(n)
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		if (n < 1)
			return 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	public static int climbStairsWithoutExtraArray(int n) {

		// Time Complexity - O(n)
		// Space Complexity -O(1)
		// arr[0,1,2,3..]
		// arr[a,b,c ] we need only three space to store our required data
		// arr[ a,b,c]

		// int[] arr=new int[n+1];
		int a = 1;
		int b = 1;
		int c = 0;
		if (n < 1)
			return 1;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static int climbStairsWithThreeStep(int n) {

		// Can climb 1,2 or 3 stairs at a time
		// Time Complexity - O(n)
		// Space Complexity -O(1)
		// arr[0,1,2,3,4.]
		// arr[a,b,c,d ] we need only three space to store our required data
		// arr[ a,b,c,d]

		// int[] arr=new int[n+1];
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 0;
		if (n <= 2)
			return n;
		for (int i = 3; i <= n; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;
	}
	
	public static int climbKStairs(int n,int k) {
		// Time Complexity - O(n)
		// Space Complexity -O(n)
		// Can climb k stairs at a time
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		if (n < 1)
			return 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if(i<j){
					continue;
				}
				arr[i] += arr[i - j];
			}
			
		}
		return arr[n];
	}
}
