import java.util.Scanner;
public class Div{

   public static void main(String[] args) {

	int num1,num2,div;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1:");
	num1 = sc.nextInt();
	System.out.println("Enter 2:");
	num2 = sc.nextInt();
	sc.close();
	div = num1/num2;
	System.out.println("Division: "+div);
   }
}