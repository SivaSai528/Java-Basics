import java.util.Scanner;
public class Rem{

   public static void main(String[] args) {

	int num1,num2,rem;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1:");
	num1 = sc.nextInt();
	System.out.println("Enter 2:");
	num2 = sc.nextInt();
	sc.close();
	rem = num1%num2;
	System.out.println("Reminder: "+rem);
   }
}