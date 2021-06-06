package basic;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 67, num2 = 85;
		System.out.println("--Before Swapping--");
		System.out.println("First Number = "+ num1);
		System.out.println("Second Number = "+ num2);
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println("\n--After Swapping--");
		System.out.println("First Number = "+ num1);
		System.out.println("Second Number = "+ num2);
	}

}
