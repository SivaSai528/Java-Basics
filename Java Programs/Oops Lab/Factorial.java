import java.util.Scanner;
class Factorial{  
 public static void main(String args[]){  
  int number,fact,i;
  System.out.println("Enter an Positive number:");
  Scanner s=new Scanner(System.in);
  number=s.nextInt();
  fact=1;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  