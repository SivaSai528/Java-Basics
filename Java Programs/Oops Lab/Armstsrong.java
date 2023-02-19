import java.util.Scanner;  
import java.lang.Math;  
public class Armstsrong 
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;

//counting digits
temp=n;   
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   

//Caluclate Sum
temp = n;
while(temp>0)   
{     
last = temp % 10;
// math.pow(number,power) is a function to find out power of a some number
sum +=  (Math.pow(last, digits));   // sum = sum + last^digit
temp = temp/10;   
}  

//compares the sum with n  
if(n==sum) 
return true;
else return false;   

}
public static void  main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
num=sc.nextInt();  
if(isArmstrong(num))  
{  
System.out.print("Armstrong ");  
}  
else   
{  
System.out.print("Not Armstrong ");  
}  
}   
} 