package Week1.day2;

public class Car {
		public short getRegistrationNumber() 		{
		short s=4321;
		System.out.println("Registration Number: XXXXXXX" +s);
		return s;
		}
        private String ownerName()         {
		String ownerName="Sam";
		System.out.println("Owner Name: " +ownerName);
		return ownerName;
        }
		String carModel() {
			String carModel="Nissan Altima";
			System.out.println("Car Model: "+carModel);
			return carModel;
		}
		public boolean ispunctured()		{
			boolean ispunctured=false;
			System.out.println("Is Punctured: "+ispunctured);
			return ispunctured;
	}
		public int sub(int num1, int num2) {
			return num1-num2;
		}
		public int mul(int num1, int num2, int num3) {
			return num1*num2*num3;
		}
		public int div(int num1,int num2) {
			return num1/num2;
		}
		public static void main(String[] args) {
			Car c=new Car();
			c.getRegistrationNumber();
			c.ownerName();
			c.carModel();
			c.ispunctured();

		    int sub = c.sub(5, 9);
		    System.out.println("Sum of Substraction: "+sub);
		    int mul = c.mul(4, 7, 9);
		    System.out.println("Sum of Multiplication: "+mul);
		    int div = c.div(6,3);
		    System.out.println("Sum of Division: "+div);
		}
}

