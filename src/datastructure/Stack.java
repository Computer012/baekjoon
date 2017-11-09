package datastructure;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] stack = new int[n];
		int top = -1;
		
		int add = 0;
		String commend; 
		for (int i = 0; i < n; i++) {
			commend = sc.next();
			if (commend.equals("push"))
				add = sc.nextInt();

			switch (commend) {
			case "push":
				stack[++top] = add;
				break;
			case "pop":
				if(top != -1)
					System.out.println(stack[top--]);
				else
					System.out.println(top);
				break;
			case "size":
				System.out.println(top+1);
				break;
			case "empty":
				if(top != -1)
					System.out.println(0);
				else
					System.out.println(1);
				break;
			case "top":
				if(top != -1)
					System.out.println(stack[top]);
				else
					System.out.println(top);
				break;
			}
		}
	}

}
