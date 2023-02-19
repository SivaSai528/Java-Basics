import java.util.Scanner;
public class Add {

   public static void main(String[] args) {

	int num1,num2,sum,sub,mul,div;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1:");
	num1 = sc.nextInt();
	System.out.println("Enter 2:");
	num2 = sc.nextInt();
	sc.close();
	sum = num1 + num2;
	System.out.println("Addition:"+sum);
	sub = num1 - num2;
	System.out.println("Subtraction:"+sub);
	mul = num1 * num2;
	System.out.println("Multiplication:"+mul);
	div = num1/num2;
	System.out.println("Division: "+div);
   }
}
