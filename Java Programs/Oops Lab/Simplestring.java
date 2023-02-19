import java.util.StringTokenizer;  
public class Simplestring{  
 public static void main(String args[]){  
   StringTokenizer a = new StringTokenizer("computer science and engineering"," ");  
     while (a.hasMoreTokens()) {  
         System.out.println(a.nextToken());  
     }  
   }  
}  
