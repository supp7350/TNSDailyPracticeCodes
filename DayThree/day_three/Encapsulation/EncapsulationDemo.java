package DayThree.day_three.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {

		
		//object creation
		
		EncapsulationDemo obj = new EncapsulationDemo();
		
		obj.setSerialNum(101);
		obj.setName("Pooja");
		obj.setAge(21);
		
		System.out.println(obj);
		
	}

    private void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    private void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    private void setSerialNum(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSerialNum'");
    }

}