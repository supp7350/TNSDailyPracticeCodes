package DayOne.DayTwo.day_two.Conditional_Statements;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		int a=10, b=30, c=75;
		
		System.out.println("The Largest number is: ");
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
	}

}