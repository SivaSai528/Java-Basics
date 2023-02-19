import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
int num;
System.out.println("Enter an integer number:");
Scanner b=new Scanner(System.in);
num=b.nextInt();
if(num%2==0)
{
System.out.println(num+ "is an Even");
}
else
{
System.out.println(num+ "is an Odd");
}
}
}

