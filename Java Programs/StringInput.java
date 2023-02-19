import java.util.Scanner;
class StringInput{

   public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);// System.in is a standard input
	System.out.print("Enter a String:");// Print means Print in instant Line Println means print in next line 
    String Str= sc.next(); // Reads String Before the Space
	System.out.println("String: "+Str);
   }
}