import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int num,i,n,rem;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
i=num;
for(n=0;num>0;num/=10)
{
rem=num%10;
n=(n*10)+rem;
}
if(n==i)
System.out.println(i+ "is a palindrome number");
else
System.out.println(i+ "is not a palindrome number");
}
}

