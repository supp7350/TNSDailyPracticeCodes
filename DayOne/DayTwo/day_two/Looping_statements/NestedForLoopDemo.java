// Program to print the multiplication tables in a given range by using nested for loop
package DayOne.DayTwo.day_two.Looping_statements;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		int beg= 10;
		int end = 11;
		
		for(int i=beg; i<=end; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i*j);
			}
			System.out.println();
			
		}
        
	}

}