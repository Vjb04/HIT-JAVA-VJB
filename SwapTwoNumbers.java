package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100, num2 = 210, temp;
		System.out.println("--Before Swapping--");
		System.out.println("First Number = "+ num1);
		System.out.println("Second Number = "+ num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("\n--After Swapping--");
		System.out.println("First Number = "+ num1);
		System.out.println("Second Number = "+ num2);
	}

}
