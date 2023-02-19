import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("E:\\Siva.txt");//initiate the file writer    
           fw.write("Welcome all of you to JAVA LAB.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
     }    
}