package function;

public class SelfNumber {

	public static void main(String[] args) {
		new SelfNumber();
	}

	public SelfNumber() {
		int number = 0;
		int i = 0;
		final int SIZE = 10000;
		boolean [] isHaveSelfNum = new boolean [SIZE];
		
		for(i=0; i<SIZE; i++)
			isHaveSelfNum[i] = false;
		
		for (i=1; number<=SIZE; i++) {
			number = digitSum(i);
			if (number < SIZE)
				isHaveSelfNum[number] = true;
		}
			
		for (i=1; i<SIZE-5; i++)
			if (!isHaveSelfNum[i])
				System.out.println(i);
	}
	
	public int digitSum(int pre) {
		int next = pre;
		while(pre != 0) {
			next += pre%10;
			pre /= 10;
		}
		return next;
	}
}
