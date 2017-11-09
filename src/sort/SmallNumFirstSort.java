package sort;

import java.util.Scanner;

public class SmallNumFirstSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int nums[] = new int[num];
		for (int i=0; i<num; i++)
			nums[i] = sc.nextInt();
		
		int min, temp;
		for (int i=0; i<nums.length; i++) {
			min = i;
			for (int j=i; j<nums.length; j++)
				if (nums[min] > nums[j])
					min = j;
			temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
		
		for (int n : nums)
			System.out.println(n);
	}

}
