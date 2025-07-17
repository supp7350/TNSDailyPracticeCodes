//Program to demonstrate simple class in java

package DayThree.day_three.Encapsulation;

public class OopsConceptDemo {
	
	private int serialNum;
	private String name;
	private int age;
	
	public void setSerialNum(int serialNum)
	{
		this.serialNum=serialNum;
	}
	
	public int getSerialNum()
	{
		return serialNum;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	// object class method - to return string representation of the object
	
	public String toString()
	{
		return "OopsConceptDemo [Serial Number ="+serialNum + "name = "+name + " Age= "+age +"]";
	}
	
}