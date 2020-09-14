import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Highest Common Factor Or Greatest Common Factor:-");
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int divident = scn.nextInt();
		
		while(divident % divisor != 0){
		     int rem = divident % divisor;
		     divident = divisor;
		     divisor = rem;
		}
		System.out.println("The HCF of the number is :"+ divisor);
	}
}

