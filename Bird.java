package basic;

public class Bird {
	int age;
	String name;
		Bird()
		{
			System.out.println("This is the parrot");
		}
		Bird(String x)
		{
			name = x;
			System.out.println("This is the " + name);
		}
		Bird(int n, String z)
		{
			age = n;
			name = z;
			System.out.println("This is the " + age + " years\t" + name);
		}
	public static void main(String arr[])
	{
		Bird a = new Bird();
		Bird b = new Bird("Crow");
		Bird c = new Bird(20, "Sparrow");
	}

}
