import java.util.Scanner;
public class ReverseArray{  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = s.nextInt();
        // create an array
        int[] array = new int[size];
 
        // reading values from user keyboard
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            array[i] = value;
 
        } 
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = array.length-1; i >= 0; i--) {  
            System.out.print(array[i] + " ");  
        }  
    }  
}  
