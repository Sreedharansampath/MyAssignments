package Week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int n=40;
	boolean flag=false;
	for(int i=2; i<=n-1;i++) {
		if (n%i==0) {
			flag=true;
			break;
		}
	}
		if (flag==false) {
			System.out.println("Given number is prime");
		}
		else
			System.out.println("Given number is not prime");
	}
}

